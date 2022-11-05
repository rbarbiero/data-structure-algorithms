package br.com.rbarbiero.algorithms.calculating;

import br.com.rbarbiero.datastructure.tree.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeIsBalancedTest {

    private final BinaryTreeIsBalanced binaryTreeIsBalanced = new BinaryTreeIsBalanced();

    @Test
    void execute() {

        final BinaryTree<Integer> unbalancedTree = new BinaryTree<>(1, null, null);

        unbalancedTree.insert(3);
        unbalancedTree.insert(13);
        unbalancedTree.insert(12);
        unbalancedTree.insert(6);
        unbalancedTree.insert(8);
        unbalancedTree.insert(11);
        unbalancedTree.insert(9);

        binaryTreeIsBalanced.execute(unbalancedTree);
    }
}