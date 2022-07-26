package br.com.rbarbiero.datastructure.list.array;

import static org.assertj.core.api.Assertions.assertThat;

import br.com.rbarbiero.datastructure.list.MyLinkedMyList;
import org.junit.jupiter.api.Test;

class MyLinkedListTest {

	private final MyLinkedMyList<Integer> linkedMyList = new MyLinkedMyList<>();

	@Test
	void append() {
		linkedMyList.append(1);
		linkedMyList.append(2);
		linkedMyList.append(3);
	}

	@Test
	void prepend() {
		linkedMyList.prepend(1);
		linkedMyList.prepend(2);
		linkedMyList.prepend(3);
	}

	@Test
	void delete() {
		linkedMyList.append(1);
		linkedMyList.append(2);
		linkedMyList.append(3);

		linkedMyList.delete(1);

		assertThat(linkedMyList.contains(1)).isFalse();
		assertThat(linkedMyList.contains(2)).isTrue();
		assertThat(linkedMyList.contains(3)).isTrue();
	}

	@Test
	void pop() {
		linkedMyList.append(1);
		linkedMyList.append(2);
		linkedMyList.append(3);

		final Integer removed = linkedMyList.pop();

		assertThat(removed).isOne();
	}

	@Test
	void contains() {
		linkedMyList.append(1);
		linkedMyList.append(2);
		linkedMyList.append(3);

		assertThat(linkedMyList.contains(1)).isTrue();
	}

	@Test
	void notContains() {
		linkedMyList.append(1);
		linkedMyList.append(2);
		linkedMyList.append(3);

		assertThat(linkedMyList.contains(4)).isFalse();
	}
}
