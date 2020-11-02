package homework14.task1;

import java.util.Comparator;

class FilteredByName implements Comparator<Main> {
    public int compare(Main obj1, Main obj2) {
        String str1 = obj1.getName();
        String str2 = obj2.getName();

        return str1.compareTo(str2);
    }
}