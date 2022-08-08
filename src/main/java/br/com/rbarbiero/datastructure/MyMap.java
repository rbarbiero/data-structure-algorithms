package br.com.rbarbiero.datastructure;

public interface MyMap<K, V> {

  V put(K k, V v);

  V get(K k);
}
