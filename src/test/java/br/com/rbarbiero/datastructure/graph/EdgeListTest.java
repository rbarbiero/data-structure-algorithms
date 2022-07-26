package br.com.rbarbiero.datastructure.graph;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EdgeListTest {

	@Test
	@DisplayName("Should add an edge with success")
	void shouldAddEdge() {

		final Graph representation = new EdgeList();
		representation.add(1, 3);

		final boolean exist = representation.exist(1, 3);

		assertThat(exist).isTrue();
	}

	@Test
	@DisplayName("Should return false when edge does not exist")
	void shouldReturnFalseWhenItDoesNotExist() {

		final Graph representation = new EdgeList();

		final boolean exist = representation.exist(1, 3);

		assertThat(exist).isFalse();
	}
}
