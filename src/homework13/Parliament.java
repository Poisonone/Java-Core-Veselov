package homework13;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Parliament {
    Fraction fraction;
    List<Fraction> rada = new ArrayList<>();
    ListIterator<Fraction> iterator1 = rada.listIterator();
    ListIterator<Fraction> iterator2 = rada.listIterator();
    String fractionname;
    Scanner sc = new Scanner(System.in);

    public void addFraction() {
        System.out.println("Enter the name of the fraction: ");
        String inputname = sc.nextLine();
        rada.add(new Fraction(inputname));
    }

    public void deleteFraction() {
        System.out.println("Enter the name of the fraction: ");
        String inputname = sc.nextLine();
        String check = sc.nextLine();
        while (iterator1.hasNext()) {
            Fraction next = iterator1.next();
            if (check.equalsIgnoreCase(fraction.getName())) {
                iterator1.remove();
            }
        }
    }

    public void showAllTheFractions() {
        String inputname = sc.nextLine();
        for (Fraction i : rada) {
            System.out.println(i);
        }
    }

    public void showTheEnteredFraction() {
        System.out.println("Enter the name of the fraction: ");
        String inputname = sc.nextLine();
        for (Fraction i : rada) {
            if (inputname.equalsIgnoreCase(i.getName())) {
                System.out.println(i);
            }
        }
    }

    public void addADeputytoTheFraction() {
        System.out.println("Enter the name of the fraction: ");
        String inputfrname = sc.nextLine();
        for (Fraction i : rada) {
            if (inputfrname.equalsIgnoreCase(i.getName())) {
                i.newMember();
            }
        }
    }

    public void removeADeputyFromTheFraction() {
        System.out.println("Enter the name of the fraction: ");
        String inputfrname = sc.nextLine();
        System.out.println("Enter the name of the deputy: ");
        String inputdename = sc.nextLine();
        while (iterator2.hasNext()) {
            Fraction next = iterator2.next();
            if (inputfrname.equalsIgnoreCase(fraction.getName())) {
                if (inputdename.equalsIgnoreCase(fraction.deputy.getName())) {
                    iterator2.remove();
                }
            }
        }

    }

    public void showAllCorruptDeputies() {
        System.out.println("Enter the name of the fraction: ");
        String inputfrname = sc.nextLine();
        for (Fraction i : rada) {
            if (inputfrname.equalsIgnoreCase(i.getName())) {
                if (fraction.deputy.corrupt == true) {
                    System.out.println(i);
                }
            }
        }
    }

    public void showAllTheDeputies() {
        System.out.println("Enter the name of the fraction: ");
        String inputfrname = sc.nextLine();
        for (Fraction i : rada) {
            if (inputfrname.equalsIgnoreCase(i.getName())) {
                System.out.println(i);
            }
        }
    }

}



