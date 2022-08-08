package br.com.rbarbiero.algorithms.calculating.dynamicprogramming;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountingBitsTest {

  private final CountingBits countingBits = new CountingBits();

  @Test
  void execute() {

    final int[] result = countingBits.execute(5);

    assertThat(result).containsExactlyInAnyOrder(0, 1, 1, 2, 1, 2);
  }
}
