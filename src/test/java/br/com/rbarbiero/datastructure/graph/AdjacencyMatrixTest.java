package br.com.rbarbiero.datastructure.graph;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AdjacencyMatrixTest {

	@Test
	@DisplayName("Should add an adjacency with success")
	void shouldAddEdge() {

		final Graph representation = new AdjacencyMatrix(3);
		representation.add(0, 1);

		final boolean exist = representation.exist(0, 1);

		assertThat(exist).isTrue();
	}

	@Test
	@DisplayName("Should return false when edge does not exist")
	void shouldReturnFalseAndDoesNotExist() {

		final Graph representation = new AdjacencyMatrix(3);

		final boolean exist = representation.exist(1, 2);

		assertThat(exist).isFalse();
	}
}
