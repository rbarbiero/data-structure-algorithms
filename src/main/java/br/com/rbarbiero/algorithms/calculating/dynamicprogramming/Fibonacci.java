package br.com.rbarbiero.algorithms.calculating.dynamicprogramming;

public class Fibonacci {

  public int execute(final int value) {
    if (value < 1) {
      return 0;
    }

    int[] memo = new int[value + 1];

    // base cases
    memo[0] = 0;
    memo[1] = 1;

    for (int i = 2; i <= value; i++) {
      memo[i] = memo[i - 1] + memo[i - 2];
    }

    return memo[value];
  }
}
