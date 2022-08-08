package br.com.rbarbiero.algorithms.sorting;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BubbleSortTest {

  private final BubbleSort bubbleSort = new BubbleSort();

  @Test
  void execute() {

    int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    final int[] sorted = bubbleSort.execute(array);

    assertThat(sorted).isSorted();
  }
}
