package br.com.rbarbiero.datastructure.map;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

import br.com.rbarbiero.datastructure.MyMap;
import br.com.rbarbiero.datastructure.list.MyLinkedMyList;

public class MyHashMap<K, V> implements MyMap<K, V> {

  private final MyLinkedMyList<MyEntry<K, Object>>[] elementData = new MyLinkedMyList[10];

  @Override
  public V put(K k, V v) {
    final int position = this.hash(k);

    MyLinkedMyList<MyEntry<K, Object>> bucket = elementData[position];
    MyEntry<K, Object> entry = new MyEntry<>(k, v);

    if (bucket == null) {
      bucket = new MyLinkedMyList<>();
    }

    if (!bucket.contains(entry)) {
      bucket.prepend(entry);
      elementData[position] = bucket;
    }

    return v;
  }

  @Override
  public V get(K key) {

    final int position = this.hash(key);

    final MyLinkedMyList<MyEntry<K, Object>> element = this.elementData[position];

    if (element == null) {
      return null;
    }

    final Object[] values = element.toArray();

    for (int x = 0; x < element.toArray().length; x++) {
      final MyEntry<K, Object> value = (MyEntry<K, Object>) values[x];
      if (value.getKey() == key) {
        return (V) value.getValue();
      }
    }

    return null;
  }

  private int hash(K k) {

    if (k instanceof String key) {
      String hashKey = "";
      for (int x = 0; x < key.length(); x++) {
        hashKey = hashKey.concat(valueOf((int) key.charAt(x)));
      }
      return this.hash(parseInt(hashKey));
    } else if (k instanceof Integer key) {
      return this.hash(key);
    } else {
      return this.hash(k.hashCode());
    }
  }

  private int hash(int key) {
    return key % elementData.length;
  }
}
