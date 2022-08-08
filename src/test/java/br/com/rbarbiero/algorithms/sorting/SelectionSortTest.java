package br.com.rbarbiero.algorithms.sorting;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SelectionSortTest {

  private final SelectionSort selectionSort = new SelectionSort();

  @Test
  void execute() {

    int[] array = {4, 6, 2, 7, 3, 8, 2, 9, 0};

    final int[] sorted = selectionSort.execute(array);

    assertThat(sorted).isSorted();
  }
}
