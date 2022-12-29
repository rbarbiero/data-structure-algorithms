package br.com.rbarbiero.algorithms.calculating;

import static br.com.rbarbiero.algorithms.calculating.RotateDirection.*;

import br.com.rbarbiero.datastructure.tree.AVLBinaryTree;

public class BinaryTreeIsBalanced {

  private boolean isBalanced = true;
  private AVLBinaryTree unbalancedNode = null;
  private int balanceFactor = 0;

  public boolean execute(final AVLBinaryTree node) {
    return this.isBalanced(node);
  }

  private boolean isBalanced(final AVLBinaryTree node) {
    if (this.isChild(node)) {
      node.setBalanceFactor(0);
      return true;
    } else {
      this.getHeight(node);
      return isBalanced;
    }
  }

  private int getHeight(final AVLBinaryTree node) {

    if (this.isChild(node)) {
      return 0;
    } else {

      int leftHeight = (node.getLeft() == null) ? -1 : this.getHeight(node.getLeft());
      int rightHeight = ((node.getRight() == null) ? -1 : this.getHeight(node.getRight()));

      if (this.isBalanced) {
        this.balanceFactor = leftHeight - (rightHeight);
        this.isBalanced = this.isBalanced(balanceFactor);
        if (!this.isBalanced) {
          this.unbalancedNode = node;
        }
      }
      node.setBalanceFactor(balanceFactor);
      return balanceFactor;
    }
  }

  public AVLBinaryTree balance(final AVLBinaryTree avlBinaryTree) {
    final RotateDirection rotation = getRotation(this.unbalancedNode);
    return rotation.execute(avlBinaryTree);
  }

  private boolean isBalanced(final int balanceFactor) {
    return balanceFactor >= -1 && balanceFactor <= 1;
  }

  private boolean isChild(final AVLBinaryTree node) {
    return node.getLeft() == null && node.getRight() == null;
  }
}
