package br.com.rbarbiero.datastructure.tree;

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
public class BinaryTree<T> implements Tree<T> {

  private BinaryTree<T> right;
  private BinaryTree<T> left;
  private final T value;

  public BinaryTree(final T value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }

  public BinaryTree(final T value, final BinaryTree<T> right, final BinaryTree<T> left) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

  public T search(final T value) {
    return this.search(value, this);
  }

  private T search(final T value, final BinaryTree<T> node) {
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
  public void insert(T value) {
    if (value.hashCode() <= this.value.hashCode()) {
      if (this.left == null) {
        this.left = new BinaryTree<>(value);
      } else {
        this.left.insert(value);
      }
    } else {
      if (this.right == null) {
        this.right = new BinaryTree<>(value);
      } else {
        this.right.insert(value);
      }
    }



  }

  public BinaryTree<T> getRight() {
    return right;
  }

  public BinaryTree<T> getLeft() {
    return left;
  }

  public T getValue() {
    return value;
  }
}
