package br.com.rbarbiero.algorithms.sorting;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BubbleSortTest {

	private final BubbleSort bubbleSort = new BubbleSort();

	@Test
	void execute() {

		int[] array = {4, 6, 2, 7, 3, 8, 2, 9, 0};

		final int[] sorted = bubbleSort.execute(array);

		assertThat(sorted).isSorted();
	}
}
