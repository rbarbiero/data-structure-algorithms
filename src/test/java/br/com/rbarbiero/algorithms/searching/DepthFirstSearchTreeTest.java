package br.com.rbarbiero.algorithms.searching;

import static br.com.rbarbiero.algorithms.searching.fixture.DepthFirstSearchTestFixture.undirectedIntegersAdjacencyList;
import static org.assertj.core.api.Assertions.assertThat;

import br.com.rbarbiero.datastructure.graph.Graph;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DepthFirstSearchTreeTest {

	@Test
	@DisplayName("Should traverse entire graph until find last node")
	void search() {

		final Graph representation = undirectedIntegersAdjacencyList();
		final DepthFirstSearchTree searchTree = new DepthFirstSearchTree(representation);
		final Integer node = 1;
		final Integer value = 9;
		final Integer found = searchTree.execute(node, value);

		assertThat(found).isEqualTo(9);
	}
}
