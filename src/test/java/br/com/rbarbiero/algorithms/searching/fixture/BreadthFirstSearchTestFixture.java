package br.com.rbarbiero.algorithms.searching.fixture;

import br.com.rbarbiero.datastructure.graph.EdgeList;
import br.com.rbarbiero.datastructure.graph.Graph;

public class BreadthFirstSearchTestFixture {

	public static Graph undirectedIntegersEdgeList() {

		final Graph representation = new EdgeList();
		representation.add(1, 2);
		representation.add(1, 3);
		representation.add(1, 4);
		representation.add(1, 5);

		representation.add(2, 1);
		representation.add(2, 3);
		representation.add(2, 7);

		representation.add(3, 1);
		representation.add(3, 2);
		representation.add(3, 4);

		representation.add(4, 1);
		representation.add(4, 3);
		representation.add(4, 5);
		representation.add(4, 8);

		representation.add(5, 1);
		representation.add(5, 4);
		representation.add(5, 6);

		representation.add(6, 5);
		representation.add(6, 7);
		representation.add(6, 8);

		representation.add(7, 2);
		representation.add(7, 6);

		representation.add(8, 4);
		representation.add(8, 6);

		representation.add(8, 9);
		representation.add(9, 8);

		return representation;
	}
}
