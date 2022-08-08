package br.com.rbarbiero.algorithms.searching;

import static org.assertj.core.api.Assertions.assertThat;

import br.com.rbarbiero.datastructure.tree.BinaryTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

  private final BinarySearchTree binarySearchTree = new BinarySearchTree();

  @Test
  @DisplayName("Should find node with success")
  void execute() {

    final BinaryTree<Integer> root = new BinaryTree<>(1, null, null);

    root.insert(2);
    root.insert(3);
    root.insert(4);

    final Integer found = binarySearchTree.execute(root, 3);

    assertThat(found).isEqualTo(3);
  }
}
