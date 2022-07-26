package br.com.rbarbiero.datastructure.graph;

public interface Graph {
	void add(Integer from, Integer to);

	boolean exist(Integer from, Integer to);

	int[] getChildren(Integer node);
}
