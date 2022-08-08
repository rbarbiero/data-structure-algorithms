package br.com.rbarbiero.datastructure.graph;

import br.com.rbarbiero.datastructure.Graph;

/***
 * An adjacency list is a collection of unordered lists used
 * to represent a finite graph. Each unordered list within an adjacency list describes the set of
 * neighbors of a particular vertex in the graph. This is one of several commonly used
 * representations of graphs for use in computer programs.
 *
 * Time Complexity
 *
 * Adding a vertex      O(1)
 * Removing a vertex   (V+E)
 * Adding an edge       O(1)
 * Removing an edge     O(E)
 * Querying for an edge O(V)
 * Finding neighbors    O(V)
 *
 */
public class AdjacencyList implements Graph {

  private final int[][] vertices;

  public AdjacencyList(final int vertices) {
    this.vertices = new int[vertices][vertices];
    for (int x = 0; x < this.vertices.length; x++) {
      for (int y = 0; y < this.vertices[x].length; y++) {
        this.vertices[x][y] = -1;
      }
    }
  }

  @Override
  public void add(final Integer from, final Integer to) {

    for (int x = 0; x < vertices[from].length; x++) {
      if (vertices[from][x] == -1) {
        vertices[from][x] = to;
        break;
      }
    }
  }

  @Override
  public boolean exist(final Integer from, final Integer to) {
    return vertices[from][to] != -1;
  }

  @Override
  public int[] getChildren(final Integer node) {
    final int[] children = new int[vertices.length];
    int pos = 0;
    for (int i = 0; i < this.vertices[node].length; i++) {
      if (this.vertices[node][i] != -1) {
        children[pos++] = vertices[node][i];
      }
    }
    return children;
  }
}
