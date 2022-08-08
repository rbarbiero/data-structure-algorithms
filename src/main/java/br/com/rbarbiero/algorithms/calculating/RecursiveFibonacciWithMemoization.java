package br.com.rbarbiero.algorithms.calculating;

import java.util.HashMap;
import java.util.Map;

/***
 * The time taken by recursive Fibonacci is O(2^n) or exponential.
 */
public class RecursiveFibonacciWithMemoization {

  private final Map<Integer, Integer> memo = new HashMap<>();

  public int execute(final int value) {

    if (value <= 1) {
      return value;
    }

    final Integer memoized = this.memo.get(value);

    return (memoized != null) ? memoized : this.calculate(value);
  }

  private Integer calculate(final Integer value) {
    final int result = this.execute(value - 1) + this.execute(value - 2);
    this.memo.put(value, result);
    return result;
  }
}
