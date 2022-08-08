package br.com.rbarbiero.algorithms.sorting;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class QuickSortTest {

  @Test
  void execute() {

    final int[] unsorted = new int[] {10, 80, 30, 90, 20, 28, 40, 50, 15, 39, 70};

    final QuickSort quickSort = new QuickSort();

    final int[] sorted = quickSort.execute(unsorted);

    assertThat(sorted).isSorted();
  }
}
