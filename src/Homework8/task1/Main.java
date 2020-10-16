package Homework8.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String menu;
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("|       MENU SELECTION     |");
        System.out.println("|         Options:         |");
        System.out.println("|    1. Name Checking      |");
        System.out.println("|    2. Season Checking    |");
        System.out.println("|3. Months with less number of days |");
        System.out.println("|4. Months with more number of days |");
        System.out.println("|5. Output next Season |");
        System.out.println("|6. Output previous Season |");
        System.out.println("|7. Output Months with even number of days |");
        System.out.println("|8. Output Months with odd number of days |");
        System.out.println("|9. Check if inputted Month have even number of days or odd |");

        menu = sc.nextLine();

        if (menu.equals("1")) {
            System.out.println("U've typed '1' ");
            System.out.println("Type the name of month");
            input = sc.nextLine();
            for (Months item : Months.values()) {
                if (input.equalsIgnoreCase(item.name())) {
                    System.out.println("U've divined it");
                }
            }

        } else if (menu.equals("2")) {
            System.out.println("U've typed '2' ");
            System.out.println("Type the name of month");
            input = sc.nextLine();
            for (Months item : Months.values()) {
                if (input.equalsIgnoreCase(item.name())) {
                    System.out.println(item.seasons);
                }
            }


        } else if (menu.equals("3")) {
            System.out.println("U've typed '3' ");
            System.out.println("Type the name of month");
            input = sc.nextLine();
            Months saved = null;
            for (Months item : Months.values()) {
                if (input.equalsIgnoreCase(item.name())) {
                    saved = item;
                }
            }
            for (Months item : Months.values()) {
                if (saved.getDays() < item.getDays()) {
                    System.out.println(item.name());
                }
            }
        } else if (menu.equals("4")) {
            System.out.println("U've typed '4' ");
            System.out.println("Type the name of month");
            input = sc.nextLine();
            Months saved = null;
            for (Months item : Months.values()) {
                if (input.equalsIgnoreCase(item.name())) {
                    saved = item;
                }
            }
            for (Months item : Months.values()) {
                if (saved.getDays() > item.getDays()) {
                    System.out.println(item.name());
                }
            }
        } else if (menu.equals("5")) {
            System.out.println("U've typed '5' ");
            System.out.println("Type the name of season");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("winter")) {
                System.out.println("Spring");
            } else if (input.equalsIgnoreCase("spring")) {
                System.out.println("Summer");
            } else if (input.equalsIgnoreCase("summer")) {
                System.out.println("Autumn");
            } else if (input.equalsIgnoreCase("Autumn")) {
                System.out.println("winter");
            }
        } else if (menu.equals("6")) {
            System.out.println("U've typed '6' ");
            System.out.println("Type the name of season");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("winter")) {
                System.out.println("Autumn");
            } else if (input.equalsIgnoreCase("spring")) {
                System.out.println("Winter");
            } else if (input.equalsIgnoreCase("summer")) {
                System.out.println("Spring");
            } else if (input.equalsIgnoreCase("Autumn")) {
                System.out.println("Summer");
            }
        } else if (menu.equals("7")) {
            System.out.println("U've typed '7' ");
            for (Months item : Months.values()) {
                if (item.days % 2 == 0) {
                    System.out.println(item.name());

                }
            }

        } else if (menu.equals("8")) {
            System.out.println("U've typed '8' ");
            for (Months item : Months.values()) {
                if (item.days % 2 != 0) {
                    System.out.println(item.name());
                }
            }
        } else if (menu.equals("9")) {
            System.out.println("U've typed '9' ");
            System.out.println("Enter the name of month");
            input = sc.nextLine();

            for (Months item : Months.values()) {
                if (input.equalsIgnoreCase(item.name())) {
                    if (item.days % 2 == 0) {
                        System.out.println("Місяць має парну кількість днів");
                    } else if (item.days % 2 != 0) {
                        System.out.println("Місяць має непарну кількість днів");
                    }
                }
            }
        }
    }
}
