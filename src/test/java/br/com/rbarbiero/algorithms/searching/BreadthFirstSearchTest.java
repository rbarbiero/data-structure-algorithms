package br.com.rbarbiero.algorithms.searching;

import static org.assertj.core.api.Assertions.assertThat;

import br.com.rbarbiero.algorithms.searching.fixture.BreadthFirstSearchTestFixture;
import br.com.rbarbiero.datastructure.graph.Graph;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BreadthFirstSearchTest {

	@Test
	@DisplayName("Should traverse entire graph until find last node")
	void search() {

		final Graph representation = BreadthFirstSearchTestFixture.undirectedIntegersEdgeList();

		final BreadthFirstSearch searchTree = new BreadthFirstSearch(representation);
		final Integer node = 1;
		final Integer value = 9;
		final Integer found = searchTree.execute(node, value);

		assertThat(found).isEqualTo(9);
	}
}
