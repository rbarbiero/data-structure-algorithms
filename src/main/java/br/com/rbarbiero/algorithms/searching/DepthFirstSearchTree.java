package br.com.rbarbiero.algorithms.searching;

import br.com.rbarbiero.datastructure.graph.Graph;
import br.com.rbarbiero.datastructure.list.MyLinkedMyList;
import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/***
	* Depth First Search:
	* DFS, Depth First Search, is an edge-based technique.
	* It uses the Stack data structure and performs two stages,
	* first visited vertices are pushed into the stack,
	* and second if there are no vertices then visited vertices are popped.
	*
	* The Time complexity of DFS is also O(V + E) when Adjacency List is used and O(V^2)
	* when Adjacency Matrix is used, where V stands for vertices and E stands for edges.
	*
	* */
public class DepthFirstSearchTree {

	private final Logger logger = LogManager.getLogger();
	private final MyLinkedMyList<Integer> saw = new MyLinkedMyList<>();
	private final MyLinkedMyList<Integer> unseen = new MyLinkedMyList<>();

	private final Graph graph;

	private static final String SEEING_VERTEX_MESSAGE = "Seeing vertex {}";

	public DepthFirstSearchTree(final Graph graph) {
		this.graph = graph;
	}

	private void addChildren(final Integer node) {
		if (saw.isEmpty() || !saw.contains(node)) {
			logger.info(SEEING_VERTEX_MESSAGE, node);
			saw.prepend(node);
			final int[] children = graph.getChildren(node);
			for (int x = 0; x < children.length; x++) {
				unseen.prepend(children[x]);
			}
		}
	}

	public Integer execute(Integer node, Integer value) {
		this.addChildren(node);

		if (unseen.isEmpty()) return null;

		return (Objects.equals(node, value)) ? value : this.execute(unseen.pop(), value);
	}
}
