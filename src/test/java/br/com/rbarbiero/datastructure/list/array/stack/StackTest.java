package br.com.rbarbiero.datastructure.list.array.stack;

import static org.assertj.core.api.Assertions.*;

import br.com.rbarbiero.datastructure.array.Stack;
import java.util.HashSet;
import org.junit.jupiter.api.Test;

class StackTest {

	@Test
	void push() {

		final Stack stack = new Stack();

		stack.push(1);
	}

	@Test
	void pop() {

		final Stack stack = new Stack();

		stack.push(1);

		final int pop = stack.pop();
		new HashSet<Integer>().add(1);

		assertThat(pop).isOne();
	}
}
