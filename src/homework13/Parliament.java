package homework13;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parliament {
    Fraction fraction;
    List<Fraction> rada = new ArrayList<>();
    String fractionname;
    Scanner sc = new Scanner(System.in);

    public Parliament(String fractionname) {
        this.fractionname = fractionname;
    }

    public void addFraction() {
        System.out.println("Enter the name of the fraction: ");
        String inputname = sc.nextLine();
        rada.add(new Fraction(inputname));
    }

    public void deleteFraction() {
        System.out.println("Enter the name of the fraction: ");
        String inputname = sc.nextLine();
        for (Fraction i : rada) {
            if (inputname.equalsIgnoreCase(i.getName())) {
                rada.remove(inputname);
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

}
