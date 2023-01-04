package br.com.rbarbiero.algorithms.calculating;

import br.com.rbarbiero.datastructure.tree.BinaryTree;

public enum Rotate {
  RIGHT {
    public <T> void execute(final BinaryTree<T> unbalanceNode, final BinaryTree<T> parent) {
      final BinaryTree<T> leftSubTree = unbalanceNode.getLeft();
      final BinaryTree<T> right = leftSubTree.getRight();

      leftSubTree.setRight(unbalanceNode);
      if(unbalanceNode != parent){
        parent.setLeft(leftSubTree);
      }
      unbalanceNode.setLeft(right);
      unbalanceNode.setRight(null);
    }
  },
  LEFT {
    public <T> void execute(final BinaryTree<T> unbalanceNode, final BinaryTree<T> parent) {

      final BinaryTree<T> rightSubTree = unbalanceNode.getRight();
      final BinaryTree<T> leftChild = rightSubTree.getLeft();

      rightSubTree.setLeft(unbalanceNode);
      if(unbalanceNode != parent){
        parent.setRight(rightSubTree);
      }
      unbalanceNode.setRight(leftChild);
      unbalanceNode.setLeft(null);
    }
  },
  RIGHT_LEFT {
    public <T> void execute(final BinaryTree<T> unbalanceNode, final BinaryTree<T> parent) {
      final BinaryTree<T> subRightTree = unbalanceNode.getRight();
      RIGHT.execute(subRightTree, parent);
      LEFT.execute(unbalanceNode, parent);
    }
  },
  LEFT_RIGHT {
    public <T> void execute(final BinaryTree<T> unbalanceNode, final BinaryTree<T> parent) {
    }
  };

  public <T> void execute(final BinaryTree<T> unbalanceNode, final BinaryTree<T> parent) {
    throw new IllegalArgumentException();
  }

  public static <T> Rotate from(final BinaryTree<T> unbalanceNode) {

    if (unbalanceNode.getBalanceFactor() == -2
        && unbalanceNode.getRight().getBalanceFactor() == -1) {
      return LEFT;
    } else if (unbalanceNode.getBalanceFactor() == 2
        && unbalanceNode.getRight().getBalanceFactor() == -1) {
      return RIGHT_LEFT;
    }

    throw new IllegalArgumentException();
  }
}
