package homework14.task2;

import java.util.Comparator;

public class FilteredByName implements Comparator<Commodity> {

    public int compare(Commodity obj1, Commodity obj2) {
        String str1 = obj1.getName();
        String str2 = obj2.getName();

        return str1.compareTo(str2);
    }


}