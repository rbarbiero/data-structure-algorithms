package br.com.rbarbiero.datastructure.tree;

import br.com.rbarbiero.algorithms.calculating.BinaryTreeIsBalanced;

/***
 * A binary tree is a tree data structure in which each node has at most two children, which are
 * referred to as the left child and the right child.
 * Time Complexity Non-Balanced Binary Tree
 * search	O(log n)
 * insert	O(log n)
 * delete	O(log n)
 */
public class AVLBinaryTree<T> {

  BinaryTree<T> binaryTree = new BinaryTree<>();
  private final BinaryTreeIsBalanced<T> binaryTreeIsBalanced = new BinaryTreeIsBalanced<>();

  public T search(final T value) {
    return binaryTree.search(value);
  }

  public AVLBinaryTree<T> insert(final T value) {

    binaryTree.insert(value);

    final boolean isBalanced = binaryTreeIsBalanced.execute(binaryTree);
    if (!isBalanced) {
      binaryTreeIsBalanced.balance(this.binaryTree);
      binaryTreeIsBalanced.reCalculateBalanceFactor(this.binaryTree);
      return this;
    }
    return this;
  }
}
