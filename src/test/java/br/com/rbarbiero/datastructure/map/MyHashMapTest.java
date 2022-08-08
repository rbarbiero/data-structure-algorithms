package br.com.rbarbiero.datastructure.map;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
class MyHashMapTest {

  final MyHashMap<String, Integer> integerMyHashMap = new MyHashMap<>();

  @Test
  @Order(1)
  void shouldPutItemWithSuccess() {

    integerMyHashMap.put("abc", 5);
    assertThat(integerMyHashMap.get("abc")).isEqualTo(5);
  }

  @Test
  @Order(2)
  void shouldPutItemWithSameHashWithSuccess() {

    integerMyHashMap.put("abc", 5);
    integerMyHashMap.put("aby", 5);

    assertThat(integerMyHashMap.get("abc")).isEqualTo(5);
    assertThat(integerMyHashMap.get("aby")).isEqualTo(5);
  }

  @Test
  @Order(3)
  void shouldNotFindElement() {
    assertThat(integerMyHashMap.get("abd")).isNull();
  }
}
