package br.com.rbarbiero.algorithms.sorting;

/**
	*
	* Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping
	* the adjacent elements if they are in the wrong order. This algorithm is not suitable for
	* large data sets as its average and worst-case time complexity is quite high.
	*
	* The time taken by this algorithm is always runs O(n^2) time even if the array is sorted.
	* It can be optimized by stopping the algorithm if the inner loop didn't cause any swap.
	* */
public class BubbleSort {

	public int[] execute(final int[] array) {
		return this.withRecursive(array, array.length - 1);
	}

	private int[] withRecursive(final int[] array, final int end) {

		if (end == 0) return array;
		boolean swapped =  false;

		for (int x = 0; x < end; x++) {
			final int current = array[x];
			final int adjacency = array[x + 1];
			if (current > adjacency) {
				swapped = true;
				array[x] = adjacency;
				array[x + 1] = current;
			}
		}
		return (!swapped) ? array : this.withRecursive(array, end - 1);
	}
}
