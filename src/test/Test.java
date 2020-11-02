package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        ArrayList<String> add = new ArrayList<>();
        str.add("15");
        str.add("1");
        str.add("2");
        str.add("3");
        str.add("4");
        add.add("2");
        add.addAll(str);
        System.out.println(add);
        System.out.println("-------------");

        str.set(3, "7");
        System.out.println(str);
        Collections.sort(str);
        System.out.println(str);
        System.out.println("-------------");
        for (String i : str) {
            System.out.println(i);
        }
        ArrayList<String> str2 = new ArrayList<>(str);
//        System.out.println(str2);
//        str2.add("10");
        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println(str2);
        System.out.println(str2.contains(str));
        LinkedList<String> link = new LinkedList<>();
        System.out.println(link);
        link.addLast("15");
        link.addFirst("10");
        System.out.println(link);
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Velara", 25));
        people.add(new Person("Roman", 21));
        people.add(new Person("Anton", 26));
        Person testperson = new Person("Anton", 21);
        System.out.println(people.contains(testperson));
        for (Person i : people) {
            System.out.println();
        }
    }


}
