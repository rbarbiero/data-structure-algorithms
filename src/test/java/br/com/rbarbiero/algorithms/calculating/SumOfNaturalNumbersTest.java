package br.com.rbarbiero.algorithms.calculating;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SumOfNaturalNumbersTest {

  @Test
  @DisplayName("Should sum all of natural numbers")
  void shouldSumNaturalNumbers() {

    final SumOfNaturalNumbers sum = new SumOfNaturalNumbers();
    final int result = sum.execute(5);
    assertThat(result).isEqualTo(15);
  }
}
