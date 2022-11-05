package br.com.rbarbiero.algorithms.calculating;

import br.com.rbarbiero.datastructure.tree.BinaryTree;

import java.util.ArrayList;

public class BinaryTreeIsBalanced {

    public <T> boolean execute(final BinaryTree<T> node){
        var a = new ArrayList<>();
        a.add(1);
        return this.isBalanced(node);
    }

    private <T> boolean isBalanced(final BinaryTree<T> node){
        var a = new ArrayList<>();
        a.add(1);
        if(this.isChild(node)){
           return true;
        }else{
            final int leftHeight = this.getLeftHeight(node);
            final int rightHeight = this.getRightHeight(node);
            final int balanceFactor = leftHeight - rightHeight;
            return this.isBalanced(balanceFactor);
        }
    }

    private boolean isBalanced(final int balanceFactor){
        return balanceFactor >= -1 && balanceFactor <= 1;
    }

    private <T> int getRightHeight(final BinaryTree<T> node){

        if(node == null || node.getRight() == null) return -1;

        return this.getRightHeight(node.getRight()) + 1;

    }

    private <T> int getLeftHeight(final BinaryTree<T> node){

        if(node == null || node.getLeft() == null) return -1;

        return this.getLeftHeight(node.getLeft()) + 1;
    }

    private <T> boolean isChild(final BinaryTree<T> node){
        return node.getLeft() == null && node.getRight() == null;
    }
}
