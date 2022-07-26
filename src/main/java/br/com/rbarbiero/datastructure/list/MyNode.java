package br.com.rbarbiero.datastructure.list;

public class MyNode<T> {

	private final T value;
	private MyNode<T> next;

	public MyNode(T value) {
		this.value = value;
	}

	public T getValue() {
		return this.value;
	}

	public MyNode<T> getNext() {
		return next;
	}

	public void setNext(MyNode<T> next) {
		this.next = next;
	}
}
