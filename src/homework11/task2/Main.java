package homework11.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car[][] array = new Car[(int) (Math.random() * 10)][(int) (Math.random() * 10)];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = new Car();
            }
        }
        Scanner sc = new Scanner(System.in);
        String menu = sc.nextLine();
        System.out.println("Menu");
        System.out.println("1.Output all the elements ");
        System.out.println("2.Fill all the elements with the same value");
        System.out.println("3.Descending sort");
        System.out.println("4.Ascending sort");

        if (menu.equals("1")) {
            System.out.println(Arrays.deepToString(array));
        } else if (menu.equals("2")) {
            for (Car[] i : array) {
//
            }
        } else if (menu.equals("3")) {
            System.out.println("1.HP");
            System.out.println("2. Year");
            System.out.println("3. Wheel");
            System.out.println("4. Engine");
            menu = sc.nextLine();
            if (menu.equals("1")) {
                for (Car[] i : array) {
                    Arrays.sort(i);
                }
            }

        }
    }

}
