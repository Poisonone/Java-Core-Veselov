package homework14.task2;

import homework14.task1.Main;

import java.util.Comparator;

public class FilteredByWeight implements Comparator<Commodity> {
    public int compare(Commodity obj1, Commodity obj2) {
        float weight1 = obj1.getWeight();
        float weight2 = obj2.getWeight();

        if (weight1 > weight2) {
            return 1;
        } else if (weight1 < weight2) {
            return -1;
        } else {
            return 0;
        }
    }
}
