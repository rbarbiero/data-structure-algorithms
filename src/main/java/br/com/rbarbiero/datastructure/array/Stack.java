package br.com.rbarbiero.datastructure.array;

/***
	* Stack is an abstract data type that serves as a collection of elements, with two main principal
	* operations:
	*
	* Push, which adds an element to the collection, and
	* Pop, which removes the most recently added element that was not yet removed.
	*
	* Time Complexity
	*
	* Search	O(n)
	* Insert	O(1)
	* Delete	O(1)
	*/
public class Stack {

	private static final int DEFAULT_CAPACITY = 10;
	private int[] array = new int[DEFAULT_CAPACITY];
	private int top = -1;

	public void push(final int value) {
		if (top == (DEFAULT_CAPACITY - 1)) {
			this.grow();
		}
		this.array[++top] = value;
	}

	public int pop() {
		return this.array[top--];
	}

	private void grow() {
		int[] array = new int[this.array.length * 2];

		for (int x = 0; x < this.array.length; x++) {
			array[x] = this.array[x];
		}
		this.array = array;
	}
}
