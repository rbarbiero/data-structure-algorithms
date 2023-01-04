package br.com.rbarbiero.algorithms.calculating;

import static br.com.rbarbiero.algorithms.calculating.Rotate.from;

import br.com.rbarbiero.datastructure.tree.BinaryTree;

public class BinaryTreeIsBalanced<T> {

  private boolean isBalanced = true;
  private int balanceFactor = 0;
  private BinaryTree<T> unbalancedNode;
  private BinaryTree<T> parentUnbalancedNode;

  public boolean execute(final BinaryTree<T> node) {
    return this.isBalanced(node);
  }

  private boolean isBalanced(final BinaryTree<T> node) {
    if (this.isChild(node)) {
      node.setBalanceFactor(0);
      return true;
    } else {
      this.isBalancedRecursively(node);
      return isBalanced;
    }
  }

  public int reCalculateBalanceFactor(final BinaryTree<T> node) {
    if (this.isChild(node)) {
      return 0;
    } else {

      int leftHeight =
          (node.getLeft() == null) ? -1 : this.reCalculateBalanceFactor(node.getLeft());
      int rightHeight =
          ((node.getRight() == null) ? -1 : this.reCalculateBalanceFactor(node.getRight()));

      this.balanceFactor = this.calculateBalanceFactor(leftHeight, rightHeight);

      node.setBalanceFactor(balanceFactor);
      return balanceFactor;
    }
  }

  private int isBalancedRecursively(final BinaryTree<T> node) {

    if (this.isChild(node)) {
      return 0;
    } else {
      int leftHeight = (node.getLeft() == null)
              ? -1
              : this.isBalancedRecursively(node.getLeft());
      int rightHeight =
          ((node.getRight() == null)
                  ? -1
                  : this.isBalancedRecursively(node.getRight()));

      this.balanceFactor = this.calculateBalanceFactor(leftHeight, rightHeight);
      this.isBalanced = this.isBalanced(balanceFactor);

      node.setBalanceFactor(balanceFactor);
      return balanceFactor;
    }
  }

  private int calculateBalanceFactor(final int leftHeight, final int rightHeight) {
    return leftHeight - (rightHeight);
  }

  private void setUnbalancedNode(final BinaryTree<T> node, final BinaryTree<T> parent) {
    if (node != null) {
      if (!this.isBalanced(node.getBalanceFactor())) {
        unbalancedNode = node;
        parentUnbalancedNode = parent;
      } else {
        this.setUnbalancedNode(node.getRight(), node);
        this.setUnbalancedNode(node.getLeft(), node);
      }
    }
  }

  public void balance(final BinaryTree<T> binaryTree) {
    this.setUnbalancedNode(binaryTree, binaryTree);
    if(this.unbalancedNode != null && this.parentUnbalancedNode != null){
      from(this.unbalancedNode).execute(this.unbalancedNode, this.parentUnbalancedNode);
    }

    this.unbalancedNode = null;
    this.parentUnbalancedNode = null;
  }

  private boolean isBalanced(final int balanceFactor) {
    return balanceFactor >= -1 && balanceFactor <= 1;
  }

  private boolean isChild(final BinaryTree<T> node) {
    return node.getLeft() == null && node.getRight() == null;
  }
}
