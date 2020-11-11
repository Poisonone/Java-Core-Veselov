package homework18.task1;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void addToList(List list) {
        list.add("it works");
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addToList(list);
        System.out.println(list.get(0));
    }

}
