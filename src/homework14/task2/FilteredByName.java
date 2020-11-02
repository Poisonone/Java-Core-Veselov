package homework14.task2;

import homework14.task1.Main;

import java.util.Comparator;

public class FilteredByName implements Comparator<Main> {

    public int compare(Main obj1, Main obj2) {
        String str1 = obj1.getName();
        String str2 = obj2.getName();

        return str1.compareTo(str2);
    }


}
