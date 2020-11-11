package homework18.task2;

import java.util.HashMap;
import java.util.Map;

public class MyEntry<K, V> {
    K key;
    V value;
    Map<K, V> myMappy = new HashMap<>();

    public MyEntry() {

    }

    public MyEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void mapAdd(K key, V value) {
        myMappy.put(key, value);
    }

    public void deleteWithAKey(K key) {
        myMappy.remove(key);
    }

    public void showAllTheKeys() {
        System.out.println(myMappy.keySet());
    }

    public void showAllTheValues() {
        System.out.println(myMappy.values());
    }

    public void showTheMap() {
        System.out.println(myMappy);
    }


    @Override
    public String toString() {
        return "MyEntry{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
