package br.com.rbarbiero.algorithms.sorting;

/***
 * QuickSort is a Divide and Conquer algorithm.
 * It picks an element as a pivot and partitions the given array around the picked pivot.
 * There are many versions of quickSort that pick pivot in different ways.
 *
 * Time complexity in worst case is O(N^2)
 */
public class QuickSort {

  public int[] execute(final int[] elements) {
    return this.withRecursive(elements, 0, elements.length - 1);
  }

  private int[] withRecursive(final int[] elements, final int low, final int high) {
    if (low < high) {
      int partitionIndex = this.partition(elements, low, high);
      this.withRecursive(elements, low, partitionIndex - 1);
      this.withRecursive(elements, partitionIndex + 1, high);
    }

    return elements;
  }

  private int partition(final int[] elements, final int low, final int high) {

    final int pivot = elements[high];
    int i = low - 1;

    for (int x = low; x < high; x++) {
      final int elementToCompare = elements[x];
      if (elementToCompare < pivot) {
        this.swap(elements, ++i, x);
      }
    }
    this.swap(elements, i + 1, high);
    return i + 1;
  }

  private void swap(final int[] elements, final int i, final int j) {
    final int posI = elements[i];
    final int posJ = elements[j];
    elements[i] = posJ;
    elements[j] = posI;
  }
}
