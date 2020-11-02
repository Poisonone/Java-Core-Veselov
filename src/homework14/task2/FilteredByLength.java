package homework14.task2;

import homework14.task1.Main;

import java.util.Comparator;

public class FilteredByLength implements Comparator<Commodity> {
    public int compare(Commodity obj1, Commodity obj2) {
        float length1 = obj1.getLength();
        float length2 = obj2.getLength();

        if (length1 > length2) {
            return 1;
        } else if (length1 < length2) {
            return -1;
        } else {
            return 0;
        }
    }
}
