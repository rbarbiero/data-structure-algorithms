package br.com.rbarbiero.datastructure.tree;

import br.com.rbarbiero.algorithms.calculating.BinaryTreeIsBalanced;
import java.util.Objects;

/***
 * A binary tree is a tree data structure in which each node has at most two children, which are
 * referred to as the left child and the right child.
 *
 * Time Complexity Non-Balanced Binary Tree
 *
 * search	O(log n)
 * insert	O(log n)
 * delete	O(log n)
 */
public class AVLBinaryTree implements Tree<Integer> {

  private AVLBinaryTree right;
  private AVLBinaryTree left;
  private final Integer value;
  private BinaryTreeIsBalanced binaryTreeIsBalanced = new BinaryTreeIsBalanced();
  private int balanceFactor = 0;

  public AVLBinaryTree(final Integer value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }

  public AVLBinaryTree(final Integer value, final AVLBinaryTree right, final AVLBinaryTree left) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

  public Integer search(final Integer value) {
    return this.search(value, this);
  }

  private Integer search(final Integer value, final AVLBinaryTree node) {
    if (node == null) {
      return null;
    } else if (Objects.equals(node.value.hashCode(), value.hashCode())) {
      return value;
    } else {
      return (Objects.equals(value.hashCode(), this.value.hashCode()))
          ? this.search(value, this.right)
          : this.search(value, this.left);
    }
  }

  @Override
  public void insert(final Integer value) {
    if (value.hashCode() <= this.value.hashCode()) {
      if (this.left == null) {
        this.left = new AVLBinaryTree(value);
      } else {
        this.left.insert(value);
      }
    } else {
      if (this.right == null) {
        this.right = new AVLBinaryTree(value);
      } else {
        this.right.insert(value);
      }
    }

    final boolean isBalanced = binaryTreeIsBalanced.execute(this);
    if (!isBalanced) {
      binaryTreeIsBalanced.balance(this);
    }
  }

  public AVLBinaryTree getRight() {
    return right;
  }

  public AVLBinaryTree getLeft() {
    return left;
  }

  public void setRight(final AVLBinaryTree right) {
    this.right = right;
  }

  public void setLeft(final AVLBinaryTree left) {
    this.left = left;
  }

  public Integer getValue() {
    return value;
  }

  public void setBalanceFactor(final int balanceFactor) {
    this.balanceFactor = balanceFactor;
  }

  public Integer getBalanceFactor() {
    return this.balanceFactor;
  }
}
