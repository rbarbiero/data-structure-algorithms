package br.com.rbarbiero.algorithms.searching;

import br.com.rbarbiero.datastructure.Graph;
import br.com.rbarbiero.datastructure.list.MyLinkedMyList;
import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/***
 * Breadth-First Search:
 * BFS, Breadth-First Search, is a vertex-based technique for finding the shortest path in the graph.
 * It uses a Queue data structure that follows first in first out.
 * In BFS, one vertex is selected at a time when it is visited
 * and marked then its adjacent are visited and stored in the queue. It is slower than DFS.
 *
 * The Time complexity of BFS is O(V + E) when Adjacency List is used
 * and O(V^2) when Adjacency Matrix is used, where V stands for vertices and E stands for edges.
 */
public class BreadthFirstSearch {

  private final Logger logger = LogManager.getLogger();
  private final MyLinkedMyList<Integer> saw = new MyLinkedMyList<>();
  private final MyLinkedMyList<Integer> unseen = new MyLinkedMyList<>();
  private final Graph graph;

  private static final String SEEING_VERTEX_MESSAGE = "Seeing vertex {}";

  public BreadthFirstSearch(final Graph graph) {
    this.graph = graph;
  }

  private void addChildren(final Integer node) {
    if (saw.isEmpty() || !saw.contains(node)) {
      logger.info(SEEING_VERTEX_MESSAGE, node);
      saw.append(node);
      final int[] children = graph.getChildren(node);
      for (int x = 0; x < children.length; x++) {
        unseen.append(children[x]);
      }
    }
  }

  public Integer execute(Integer node, Integer value) {

    this.addChildren(node);

    if (unseen.isEmpty()) {
      return null;
    }

    return (Objects.equals(node, value)) ? value : this.execute(unseen.pop(), value);
  }
}
