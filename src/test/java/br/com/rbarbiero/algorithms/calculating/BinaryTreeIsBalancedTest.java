package br.com.rbarbiero.algorithms.calculating;

import br.com.rbarbiero.datastructure.tree.AVLBinaryTree;
import org.junit.jupiter.api.Test;

class BinaryTreeIsBalancedTest {

  private final BinaryTreeIsBalanced binaryTreeIsBalanced = new BinaryTreeIsBalanced();

  @Test
  void execute() {

    final AVLBinaryTree unbalancedTree = new AVLBinaryTree(1, null, null);

    unbalancedTree.insert(3);
    unbalancedTree.insert(2);

    final boolean isBalanced = binaryTreeIsBalanced.execute(unbalancedTree);

    unbalancedTree.insert(13);
    unbalancedTree.insert(12);
    unbalancedTree.insert(6);
    unbalancedTree.insert(8);
    unbalancedTree.insert(11);
    unbalancedTree.insert(9);
  }
}
