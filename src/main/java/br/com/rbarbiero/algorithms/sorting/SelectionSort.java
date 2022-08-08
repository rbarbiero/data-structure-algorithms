package br.com.rbarbiero.algorithms.sorting;

/***
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element
 * (considering ascending order) from unsorted part and putting it at the beginning.
 * The algorithm maintains two sub arrays in a given array.
 *
 * Time complexity in worst case is O(n^2)
 */
public class SelectionSort {

  public int[] execute(final int[] array) {
    return this.withRecursive(array, 0);
  }

  private int[] withRecursive(final int[] array, int start) {

    if (start == array.length - 1) return array;

    int min = -1;

    for (int x = start; x < array.length; x++) {
      if (min == -1 || array[x] < array[min]) {
        min = x;
      }
    }

    final int temp = array[start];
    array[start] = array[min];
    array[min] = temp;

    return this.withRecursive(array, ++start);
  }
}
