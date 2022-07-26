package br.com.rbarbiero.datastructure.graph;

import static java.lang.System.arraycopy;

/***
	* An edge list is a data structure used to represent a graph as a list of its edges.
	* An (unweighted) edge is defined by its start and end vertex, so each edge may be represented
	* by two numbers.
	*
	*
	* Time Complexity
	*
	* add an edge O(1)
	* remove an edge O(n) where n is the total of vertices
	* searching an edge O(n) where n is the total of vertices
	*/
public class EdgeList implements Graph {

	private int[][] edges = null;

	@Override
	public void add(final Integer from, final Integer to) {
		edges = this.init();
		edges[edges.length - 1][0] = from;
		edges[edges.length - 1][1] = to;
	}

	private int[][] init() {
		if (edges == null) {
			return new int[1][2];
		} else {
			final int[][] copy = new int[edges.length + 1][2];
			arraycopy(edges, 0, copy, 0, edges.length);
			return copy;
		}
	}

	@Override
	public boolean exist(final Integer from, final Integer to) {
		if (edges != null) {
			for (int[] edge : edges) {
				if (edge[0] == from && edge[1] == to) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int[] getChildren(final Integer node) {

		final int[] children = new int[this.edges.length];

		int pos = 0;
		for (int[] edge : this.edges) {
			if (edge[0] == node) {
				children[pos] = edge[1];
				pos += 1;
			}
		}

		return children;
	}
}
