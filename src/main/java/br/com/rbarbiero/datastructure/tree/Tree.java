package br.com.rbarbiero.datastructure.tree;

public interface Tree<T> {

  void insert(T value);

  T search(final T value);
}
