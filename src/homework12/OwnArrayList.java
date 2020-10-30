package homework12;

import java.util.Arrays;

public class OwnArrayList<E> {
    private int listSize = 0;
    private int initialArraySize = 1;
    private E[] data = (E[]) new Object[initialArraySize];

    private void IncreaseArraySize() {
        data = Arrays.copyOf(data, data.length + 1);
    }

    public void add(E toBeAdded) {

        int i = data.length;
        if (listSize == data.length) {
            IncreaseArraySize();
        }
        data[listSize] = toBeAdded;
        listSize++;
    }

    public void remove(E ItemToRemove) {
        for (int i = 0; i < data.length; ++i) {
            if (data[i] == ItemToRemove) {
                for (int j = i; j < data.length - 1; j++) {
                    data[j] = data[j + 1];
                }
            }
        }
        listSize--;
    }
}
