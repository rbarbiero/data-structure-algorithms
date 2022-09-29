package br.com.rbarbiero.algorithms.calculating;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Levio Consulting algorithm test.
 * <p>
 * Given an array of integer, return the closest value to zero. If the negative closest value is
 * equals to the closest positive, return positive value
 */
class ClosestToZeroTest {

  private final ClosestToZero closestToZero = new ClosestToZero();

  @Test
  void shouldFindPositiveClosestValue() {
    int[] values = new int[]{-8, -6, -3, -2, 1, 5, 7};
    final int found = closestToZero.execute(values);

    assertThat(found).isOne();
  }

  @Test
  void shouldFindNegativeClosestValue() {
    int[] values = new int[]{-8, -6, -3, -2, 3, 5, 7};
    final int found = closestToZero.execute(values);

    assertThat(found).isEqualTo(-2);
  }

  @Test
  void shouldFindPositiveClosestValueWhenNegativeIsEqual() {
    int[] values = new int[]{-8, -6, -3, -2, 2, 5, 7};
    final int found = closestToZero.execute(values);

    assertThat(found).isEqualTo(2);
  }

  @Test
  void shouldFindZero() {
    int[] values = new int[]{-8, -6, -3, -2, 0, 2, 5, 7};
    final int found = closestToZero.execute(values);

    assertThat(found).isZero();
  }
}