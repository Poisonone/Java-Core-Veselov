package homework14.task2;

import homework14.task1.Main;

import java.util.Comparator;

public class FilteredByHeight implements Comparator<Commodity> {
    public int compare(Commodity obj1, Commodity obj2) {
        float height1 = obj1.getHeight();
        float height2 = obj2.getHeight();

        if (height1 > height2) {
            return 1;
        } else if (height1 < height2) {
            return -1;
        } else {
            return 0;
        }
    }
}
