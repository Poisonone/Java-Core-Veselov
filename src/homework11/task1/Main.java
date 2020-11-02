package homework11.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200 - 100);
            System.out.println(array[i]);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));

    }
}
