package br.com.rbarbiero.algorithms.searching;

import br.com.rbarbiero.datastructure.tree.BinaryTree;
import java.util.Objects;

/***
 * For each visited node, the total of remaining nodes that have to be looked will decrease
 * Time complexity O(log_n)
 */
public class BinarySearchTree {

  public <T> T execute(final BinaryTree<T> root, final T value) {

    if (root == null) return null;
    if (Objects.equals(root.getValue(), value)) return root.getValue();

    return (value.hashCode() > root.getValue().hashCode())
        ? this.execute(root.getRight(), value)
        : this.execute(root.getLeft(), value);
  }
}
