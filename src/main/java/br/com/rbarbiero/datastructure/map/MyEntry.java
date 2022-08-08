package br.com.rbarbiero.datastructure.map;

import java.util.Objects;

public class MyEntry<K, V> {

  K key;
  V value;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MyEntry<?, ?> myEntry = (MyEntry<?, ?>) o;
    return key.equals(myEntry.key) && value.equals(myEntry.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  public MyEntry(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }
}
