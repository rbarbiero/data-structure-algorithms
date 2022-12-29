package br.com.rbarbiero.algorithms.calculating;

import br.com.rbarbiero.datastructure.tree.AVLBinaryTree;

public enum RotateDirection {

  RIGHT,
  RIGHT_LEFT{
    public AVLBinaryTree execute(AVLBinaryTree unbalanceNode){
      final AVLBinaryTree right =  unbalanceNode.getRight();
      final AVLBinaryTree left =  unbalanceNode.getRight().getLeft();
      unbalanceNode.getRight().getLeft().setLeft(unbalanceNode);
      unbalanceNode.getRight().getLeft().setRight(unbalanceNode.getRight());
      return unbalanceNode;
    }
  },

  LEFT,
  LEFT_RIGHT();

  public AVLBinaryTree execute(final AVLBinaryTree unbalanceNode){
    throw new IllegalArgumentException();
  }

  public static RotateDirection getRotation(final AVLBinaryTree unbalanceNode) {

    if(unbalanceNode.getBalanceFactor() < -1 &&  unbalanceNode.getRight().getBalanceFactor() == 1){
      return RIGHT_LEFT;
    } else {
      return LEFT_RIGHT;
    }
  }
}
