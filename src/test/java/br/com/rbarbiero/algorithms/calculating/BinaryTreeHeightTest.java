package br.com.rbarbiero.algorithms.calculating;

import static org.assertj.core.api.Assertions.assertThat;

import br.com.rbarbiero.datastructure.tree.BinaryTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BinaryTreeHeightTest {

	private final BinaryTreeHeight binaryTreeHeight = new BinaryTreeHeight();

	@Test
	@DisplayName("Should return the height of the binary tree with success")
	void shouldCalculateHeightWithSuccess() {

		final BinaryTree root = new BinaryTree(1, null, null);

		root.insert(2);
		root.insert(3);
		root.insert(4);

		final int height = binaryTreeHeight.execute(root);

		assertThat(height).isEqualTo(3);
	}
}
