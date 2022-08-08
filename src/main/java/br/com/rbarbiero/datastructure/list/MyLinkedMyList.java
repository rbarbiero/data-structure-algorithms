package br.com.rbarbiero.datastructure.list;

import br.com.rbarbiero.datastructure.array.Queue;
import java.util.Objects;

/***
 * A linear collection of data elements whose order is not given by their physical placement
 * in memory. Instead, each element points to the next.
 *
 * Time Complexity
 *
 * Insert before first node	O(1) or constant time
 * Insert After given node	O(n) or linear time
 * Insert After last node	O(n) or linear time
 *
 * Delete first node	O(1) or constant time
 * Delete a given node	O(n) or linear time
 * Delete last node	O(n) or linear time
 *
 * Search	O(n) or linear time
 */
public class MyLinkedMyList<T> {

  private MyNode<T> head = null;

  public Object[] toArray() {
    if (this.head == null) {
      return new Queue().toArray();
    } else {
      return this.toArray(this.head, new Queue());
    }
  }

  private Object[] toArray(final MyNode<T> node, final Queue queue) {
    if (node == null) {
      return queue.toArray();
    } else {
      queue.enqueue(node.getValue());
      return this.toArray(node.getNext(), queue);
    }
  }

  public void append(final T value) {
    if (this.head == null) {
      this.head = new MyNode<>(value);
    } else {
      MyNode<T> current = this.head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      current.setNext(new MyNode<>(value));
    }
  }

  public void prepend(final T value) {
    final MyNode<T> myNode = new MyNode<>(value);
    myNode.setNext(this.head);
    this.head = myNode;
  }

  public void delete(final T value) {
    if (this.head != null) {
      if (Objects.equals(this.head.getValue(), value)) {
        this.head = head.getNext();
      } else {
        MyNode<T> current = this.head;
        while (current.getNext() != null) {
          if (Objects.equals(current.getNext().getValue(), value)) {
            current.setNext(current.getNext().getNext());
          } else {
            current = current.getNext();
          }
        }
      }
    }
  }

  public T pop() {
    final T value = this.head.getValue();
    this.head = head.getNext();
    return value;
  }

  public boolean contains(final T value) {
    return this.contains(this.head, value);
  }

  public boolean isEmpty() {
    return this.head == null;
  }

  private boolean contains(final MyNode<T> myNode, final T v) {
    return (myNode != null)
        && (Objects.equals(myNode.getValue(), v) || this.contains(myNode.getNext(), v));
  }
}
