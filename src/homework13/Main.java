package homework13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction fract = new Fraction();
        Parliament parl = new Parliament();
        System.out.println("Введіть 1 щоб додати фракцію\n" +
                "Введіть 2 щоб видалити конкретну фракцію\n" +
                "Введіть 3 щоб вивести усі  фракції\n" +
                "Введіть 4 щоб очистити конкретну фракцію\n" +
                "Введіть 5 щоб вивести конкретну фракцію\n" +
                "Введіть 6 щоб додати депутата в фракцію\n" +
                "Введіть 7 щоб видалити депутата з фракції\n" +
                "Введіть 8 щоб вивести список хабарників\n" +
                "Введіть 9 щоб вивести найбільшого хабарника");
        String input = sc.nextLine();
        if (input.equals("1")) {
            parl.addFraction();
        } else if (input.equals("2")) {
            parl.deleteFraction();
        } else if (input.equals("3")) {
            parl.showAllTheFractions();
        } else if (input.equals("4")) {
            fract.clearAllTheDeputies();
        } else if (input.equals("5")) {
            parl.showTheEnteredFraction();
        } else if (input.equals("6")) {
            parl.addADeputytoTheFraction();
        } else if (input.equals("7")) {
            parl.removeADeputyFromTheFraction();
        } else if (input.equals("8")) {
            fract.showAllTheCorrupts();
        } else if (input.equals("9")) {
            fract.showTheMostCorruptedGuy();
        }
    }
    }


