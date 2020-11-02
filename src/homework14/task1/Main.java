package homework14.task1;

import java.util.*;

public class Main implements Comparable<Object> {

    String name;
    int year;

    public static void main(String[] args) {
        FilteredByName filteredByName = new FilteredByName();
        Set<Main> myset = new TreeSet<>(filteredByName);
        myset.add(new Main("Life is strange", 1994));
        myset.add(new Main("Unknown", 2002));
        myset.add(new Main("Psychosocial", 2005));
        myset.add(new Main("How to fill the emptiness", 2001));
        System.out.println(myset);

    }

    public Main(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
    // COMPARABLE

    @Override
    public int compareTo(Object obj) {
        Main entry = (Main) obj;
        int result = name.compareTo(entry.name);
        if (result != 0)
            return result;

        result = year - entry.year;
        if (result != 0)
            return (int) result / Math.abs(result);

        return 0;
    }
}

