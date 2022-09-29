package br.com.rbarbiero.algorithms.calculating;

import static java.lang.Math.max;

import br.com.rbarbiero.datastructure.tree.BinaryTree;

/***
 * The height of a node in a binary tree is the largest number of edges in a path from a leaf node to a target node.
 * If the target node doesn't have any other nodes connected to it, the height of that node would be 0.
 * The height of a binary tree is the height of the root node in the whole binary tree.
 * In other words, the height of a binary tree is equal to the largest number of edges from the root to the most distant leaf node.
 */
public class BinaryTreeHeight {

  public <T> int execute(final BinaryTree<T> node) {
    if (node.getLeft() == null && node.getRight() == null) {
      return 0;
    } else {
      final int leftHeight = (node.getLeft() == null) ? 0 : this.execute(node.getLeft());
      final int rightHeight = (node.getRight() == null) ? 0 : this.execute(node.getRight());
      return max(leftHeight, rightHeight) + 1;
    }
  }
}
