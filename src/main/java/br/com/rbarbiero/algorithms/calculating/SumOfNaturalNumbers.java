package br.com.rbarbiero.algorithms.calculating;

class SumOfNaturalNumbers {

  /***
   * Calculate the sum of natural numbers
   * Time complexity is O(n).
   */
  public int execute(final int input) {
    return (input == 0) ? 0 : input + this.execute(input - 1);
  }
}
