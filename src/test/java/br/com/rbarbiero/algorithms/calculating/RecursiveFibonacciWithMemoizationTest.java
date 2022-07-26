package br.com.rbarbiero.algorithms.calculating;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RecursiveFibonacciWithMemoizationTest {

	private final RecursiveFibonacciWithMemoization recursiveFibonacciWithMemoization = new RecursiveFibonacciWithMemoization();

	@Test
	void execute() {

		final int result = recursiveFibonacciWithMemoization.execute(10);

		assertThat(result).isEqualTo(55);
	}
}
