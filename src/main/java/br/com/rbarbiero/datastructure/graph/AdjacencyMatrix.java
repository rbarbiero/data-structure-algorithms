package br.com.rbarbiero.datastructure.graph;

import br.com.rbarbiero.datastructure.Graph;

/***
 *
 * In graph theory and computer science, an adjacency matrix is a square matrix used to represent
 * a finite graph. The elements of the matrix indicate whether pairs of vertices are adjacent
 * or not in the graph.
 *
 * Adding a vertex O(V2) O(1)
 * Removing a vertex O(V2) O(V+E)
 * Adding an edge O(1) O(1)
 * Removing an edge O(1) O(E)
 * Querying for an edge O(1) O(V)
 * Finding neighbors O(V) O(V)
 */
public class AdjacencyMatrix implements Graph {

  private final int[][] matrix;

  public AdjacencyMatrix(int vertex) {
    this.matrix = new int[vertex][vertex];
  }

  @Override
  public void add(final Integer from, final Integer to) {
    this.matrix[from][to] = 1;
  }

  @Override
  public boolean exist(final Integer from, final Integer to) {
    return this.matrix[from][to] == 1;
  }

  @Override
  public int[] getChildren(final Integer node) {
    final int[] children = new int[matrix.length];
    int pos = 0;
    for (int i = 0; i < this.matrix[node].length; i++) {
      if (this.matrix[node][i] == 1) {
        children[pos++] = matrix[node][i];
      }
    }
    return children;
  }
}
