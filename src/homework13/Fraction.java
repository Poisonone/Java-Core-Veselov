package homework13;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Fraction {
    Deputy deputy;
    List<Deputy> deputies = new ArrayList<>();
    ListIterator<Deputy> iterator1 = deputies.listIterator();
    Scanner sc = new Scanner(System.in);
    String name;

    public Fraction() {
    }

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
        String inputName = sc.nextLine();
        System.out.println("Enter the weight");
        int inputWeight = sc.nextInt();
        System.out.println("Enter the height");
        int inputHeight = sc.nextInt();
        System.out.println("Enter the age");
        int inputAge = sc.nextInt();
        System.out.println("Enter the surname");
        String inputSurname = sc.nextLine();
        System.out.println("Enter the sex");
        String inputSex = sc.nextLine();
        System.out.println("Is he corrupt?");
        boolean isHeCorrupt = sc.nextBoolean();
        deputies.add(new Deputy(inputWeight, inputHeight, inputAge, inputName, inputSurname, isHeCorrupt, inputSex));

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
            if (deputy.corrupt == true) {
                System.out.println(i);
            }
        }
    }

    public void showTheMostCorruptedGuy() {
        int maxBribe = 0;
        for (Deputy i : deputies) {
            if (maxBribe <= deputy.getBribeSum()) {
                maxBribe = deputy.getBribeSum();
            }
            System.out.println(i);
        }
    }

    public void showAllTheDeputies() {
        for (Deputy i : deputies) {
            System.out.println(i);

        }

    }

    public void clearAllTheDeputies() {
        deputies.clear();
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "name='" + name + '\'' +
                '}';
    }
}
