package br.com.rbarbiero.datastructure.tree;

/***
	* A binary tree is a tree data structure in which each node has at most two children, which are
	* referred to as the left child and the right child.
	*
	* Time Complexity Non-Balanced Binary Tree
	*
	* search	O(n)
	* insert	O(n)
	* delete	O(n)
	*/
public class BinaryTree {

	private BinaryTree right;
	private BinaryTree left;
	private final Integer value;

	public BinaryTree getRight() {
		return right;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public Integer getValue() {
		return value;
	}

	public BinaryTree(final Integer value, final BinaryTree right, final BinaryTree left) {

		this.value = value;
		this.left = left;
		this.right = right;
	}

	public void insert(final Integer value) {
		if (value <= this.value) {
			if (this.left == null) {
				this.left = new BinaryTree(value, null, null);
			} else {
				this.left.insert(value);
			}
		} else {
			if (this.right == null) {
				this.right = new BinaryTree(value, null, null);
			} else {
				this.right.insert(value);
			}
		}
	}
}
