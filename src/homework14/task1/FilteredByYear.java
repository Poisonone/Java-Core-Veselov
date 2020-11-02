package homework14.task1;

import java.util.Comparator;

class FilteredByYear implements Comparator<Main> {
    public int compare(Main obj1, Main obj2) {
        float year1 = obj1.getYear();
        float year2 = obj2.getYear();

        if (year1 > year2) {
            return 1;
        } else if (year1 < year2) {
            return -1;
        } else {
            return 0;
        }
    }
}
