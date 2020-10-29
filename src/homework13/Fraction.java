package homework13;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Fraction {
    Deputy deputy;
    List<Deputy> deputies = new ArrayList<>();
    ListIterator<Deputy> iterator1 = deputies.listIterator();
    ListIterator<Deputy> iterator2 = deputies.listIterator();
    Scanner sc = new Scanner(System.in);
    String name;

    public Fraction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void newMember() {
        System.out.println("Enter the name");
        String inputname = sc.nextLine();
        System.out.println("Enter the weight");
        int inputweight = sc.nextInt();
        System.out.println("Enter the height");
        int inputheight = sc.nextInt();
        System.out.println("Enter the age");
        int inputage = sc.nextInt();
        System.out.println("Enter the surname");
        String inputsurname = sc.nextLine();
        System.out.println("Enter the sex");
        String inputsex = sc.nextLine();
        System.out.println("Is he corrupt?");
        boolean ishecorrupt = sc.nextBoolean();
        deputies.add(new Deputy(inputweight, inputheight, inputage, inputname, inputsurname, ishecorrupt, inputsex));

    }

    public void removeMember() {
        System.out.println("Enter the name of the deputy, buddy , we'll try to solve that problem.");
        String check = sc.nextLine();
        while (iterator1.hasNext()) {
            Deputy next = iterator1.next();
            if (check.equalsIgnoreCase(deputy.getName())) {
                iterator1.remove();
            }
        }
    }

    public void showAllTheCorrupts() {
        for (Deputy i : deputies) {
            if (deputy.isCorrupt() == true) {
                System.out.println(i);
            }
        }
    }

    public void showTheMostCorruptedGuy() {
        for (Deputy i : deputies) {
            if (deputy.getBribe() < deputy.getBribesum()) {
                deputy.setBribe(deputy.bribesum);
            }
            System.out.println(i);
        }
    }

    public void showAllTheDeputies() {
        deputies.add(new Deputy(120, 140, 25, "Oleg", "Nazarov", false, "male"));
        for (Deputy i : deputies) {
            System.out.println(i);

        }

    }

    public void clearAllTheDeputies() {
        deputies.clear();
    }

}
