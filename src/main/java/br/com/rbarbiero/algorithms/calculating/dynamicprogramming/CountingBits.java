package br.com.rbarbiero.algorithms.calculating.dynamicprogramming;

public class CountingBits {

  /**
   * Leetcode https://leetcode.com/problems/counting-bits/ Given an integer n, return an array ans
   * of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary
   * representation of i.
   *
   * <p>Example:
   *
   * <p>Input: n = 5 Output: [0,1,1,2,1,2]
   *
   * <p>Explanation: 0 --> 0 1 --> 1 2 --> 10 3 --> 11 4 --> 100 5 --> 101
   */
  public int[] execute(int n) {

    if (n <= 0) return new int[1];

    final int[] binary = new int[n + 1];

    // base cases
    binary[0] = 0;
    binary[1] = 1;

    for (int x = 2; x <= n; x++) {
      binary[x] = binary[x / 2] + x % 2;
    }

    return binary;
  }
}
