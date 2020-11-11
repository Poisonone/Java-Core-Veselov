package homework18.task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
 ** Реалізація через два ерейліста , на всякий випадок)
 */
public class MyMap implements Interface {
    private ArrayList keys;
    private ArrayList values;
    private int index;

    public MyMap() {
        keys = new ArrayList();
        values = new ArrayList();
        index = 0;
    }

    public void put(Object key, Object value) {
        keys.add(key);
        values.add(value);
        index++;
    }

    public Object get(Object key) {
        int i = keys.indexOf(key);
        if (i >= 0)
            return values.get(i);
        else
            return null;
    }

    public int size() {
        return index;
    }

    public Set keySet() {
        HashSet set = new HashSet();
        set.addAll(keys);
        return set;
    }


    class MySimpleEntry implements MyMap.MyEntry {
        Object key;
        Object value;

        public MySimpleEntry(Object k, Object v) {
            key = k;
            value = v;
        }

        public Object getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }
    }

    public Set entrySet() {
        HashSet set = new HashSet();
        for (int i = 0; i < index; i++) {
            Object k = keys.get(i);
            Object v = values.get(i);
            MySimpleEntry temp = new MySimpleEntry(k, v);
            set.add(temp);
        }
        return set;
    }
}

