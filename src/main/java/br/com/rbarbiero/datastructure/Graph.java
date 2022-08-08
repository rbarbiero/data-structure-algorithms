package br.com.rbarbiero.datastructure;

public interface Graph {
  void add(Integer from, Integer to);

  boolean exist(Integer from, Integer to);

  int[] getChildren(Integer node);
}
