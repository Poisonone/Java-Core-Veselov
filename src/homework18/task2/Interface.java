package homework18.task2;

import java.util.Set;

public interface Interface<K, V> {
    public void put(Object key, Object value);

    public Object get(Object key);

    public int size();

    public Set keySet();

    public Set entrySet();

    public interface MyEntry {
        public Object getKey();

        public Object getValue();
    }
}
