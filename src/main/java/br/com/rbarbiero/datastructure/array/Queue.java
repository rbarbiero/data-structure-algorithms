package br.com.rbarbiero.datastructure.array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/***
 * Queue is a collection of entities that are maintained in a sequence and can be modified by the
 * addition of entities at one end of the sequence and the removal of entities from the other end of
 * the sequence. By convention, the end of the sequence at which elements are added is called the
 * back, tail, or rear of the queue, and the end at which elements are removed is called the head
 * or front of the queue, analogously to the words used when people line up to wait for goods or
 * services.
 *
 * Time Complexity
 *
 * Search	O(n)
 * Insert	O(1)
 * Delete	O(1)
 */
public class Queue {

  private final Logger logger = LogManager.getLogger(Queue.class);

  private static final String QUEUE_IS_EMPTY = "Queue is empty";

  private Object[] array = new Object[10];
  private int front = -1;
  private int rear = -1;

  public Object[] toArray() {
    return (this.isEmpty()) ? new Object[0] : this.trim();
  }

  private Object[] trim() {
    final Object[] trimmed = new Object[rear + 1];
    if (rear + 1 - front >= 0) {
      System.arraycopy(this.array, front, trimmed, front, rear + 1 - front);
    }
    return trimmed;
  }

  public void enqueue(final Object value) {

    if (this.isEmpty()) {
      this.front++;
      this.rear++;
      this.array[0] = value;
    } else {

      final int position = this.calculateCircularPosition(this.rear + 1);

      if (position == this.front) {
        this.grow();
      }

      this.array[position] = value;
      this.rear++;
    }
  }

  public Object dequeue() {

    if (isEmpty()) {
      logger.info(QUEUE_IS_EMPTY);
      return -1;
    } else {

      int position = this.calculateCircularPosition(this.front);

      Object value = this.array[position];

      if (position == this.rear) {
        this.front = -1;
        this.rear = -1;
      } else {
        this.front++;
      }

      return value;
    }
  }

  private int calculateCircularPosition(final int position) {
    return (position) % this.array.length;
  }

  private boolean isEmpty() {
    return this.front == -1 && this.rear == -1;
  }

  private void grow() {

    final Object[] array = new Object[this.array.length * 2];

    System.arraycopy(this.array, 0, array, 0, this.array.length);

    this.array = array;
  }
}
