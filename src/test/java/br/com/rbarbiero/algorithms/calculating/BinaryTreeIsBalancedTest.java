package br.com.rbarbiero.algorithms.calculating;

import br.com.rbarbiero.datastructure.tree.AVLBinaryTree;
import org.junit.jupiter.api.Test;

class BinaryTreeIsBalancedTest {

  private final BinaryTreeIsBalanced<Integer> binaryTreeIsBalanced = new BinaryTreeIsBalanced<>();

  @Test
  void execute() {

    AVLBinaryTree<Integer> unbalancedTree = new AVLBinaryTree<>();

    unbalancedTree = unbalancedTree.insert(2);
    unbalancedTree = unbalancedTree.insert(1);
    unbalancedTree = unbalancedTree.insert(5);
    unbalancedTree = unbalancedTree.insert(4);
    unbalancedTree = unbalancedTree.insert(6);
    unbalancedTree = unbalancedTree.insert(7);
    unbalancedTree = unbalancedTree.insert(6);
    unbalancedTree = unbalancedTree.insert(8);
    unbalancedTree = unbalancedTree.insert(11);
    unbalancedTree = unbalancedTree.insert(9);
  }
}
