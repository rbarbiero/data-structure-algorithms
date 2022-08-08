package br.com.rbarbiero.datastructure.array;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class QueueTest {

  @Test
  @DisplayName("Should enqueue with success")
  void shouldAddWithSuccess() {

    final Queue queue = new Queue();

    queue.enqueue(1);

    assertThat(queue.dequeue()).isEqualTo(1);
    assertThat(queue.dequeue()).isEqualTo(-1);
  }

  @Test
  @DisplayName("Should enqueue and dequeued with success")
  void shouldEnqueueAndDequeueWithSuccess() {

    final Queue queue = new Queue();

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);
    queue.enqueue(6);
    queue.enqueue(7);
    queue.enqueue(8);
    queue.enqueue(9);
    queue.enqueue(10);

    assertThat(queue.dequeue()).isEqualTo(1);

    assertThat(queue.dequeue()).isEqualTo(2);
    assertThat(queue.dequeue()).isEqualTo(3);

    queue.enqueue(11);
    queue.enqueue(12);
    queue.enqueue(13);

    assertThat(queue.dequeue()).isEqualTo(4);
    assertThat(queue.dequeue()).isEqualTo(5);
    assertThat(queue.dequeue()).isEqualTo(6);
    assertThat(queue.dequeue()).isEqualTo(7);
    assertThat(queue.dequeue()).isEqualTo(8);
    assertThat(queue.dequeue()).isEqualTo(9);
    assertThat(queue.dequeue()).isEqualTo(10);
    assertThat(queue.dequeue()).isEqualTo(11);
    assertThat(queue.dequeue()).isEqualTo(12);
    assertThat(queue.dequeue()).isEqualTo(13);
  }

  @Test
  @DisplayName("Should not enqueue when it is empty")
  void shouldNotDequeueWhenItIsEmpty() {

    final Queue queue = new Queue();

    assertThat(queue.dequeue()).isEqualTo(-1);
  }
}
