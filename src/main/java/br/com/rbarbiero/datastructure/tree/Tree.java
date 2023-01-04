package br.com.rbarbiero.datastructure.tree;

public interface Tree<T> {

  BinaryTree<T> insert(T value);

  BinaryTree<T> getRight();

  BinaryTree<T> getLeft();

  T getValue();

  void setValue(T value);

  Integer getBalanceFactor();

  void setBalanceFactor(int balanceFactor);

  void setLeft(BinaryTree<T> left);

  void setRight(BinaryTree<T> right);

  T search(final T value);
}
