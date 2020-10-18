/**
 * Copyright homework 2020
 */
package homework9.task1;

/**
 * @author FreeDmaN
 * @version 0.1
 * @since jdk 1.7
 */

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws WrongInputParameter {
        // Змінна, яка відповідає за ввід даних для використання консольного меню
        String menu;
        // Змінна, яка відповідає за ввід даних для роботи програми з поставленою задачею
        String input;
        // Оголошення scanner
        Scanner sc = new Scanner(System.in);
        // Вид консольного меню
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
            // Присвоєння змінній scanner
            input = sc.nextLine();
            /*
             * Оголошення циклу, щоб пройтись по всіх значеннях enum
             */
            for (Months item : Months.values()) {
                // Перевірка чи збігається введена назва з назвою константи з Enum
                if (input.equalsIgnoreCase(item.name())) {
                    System.out.println("U've divined it");
                } else {
                    throw new WrongInputParameter("Unfair play");
                }
            }

        } else if (menu.equals("2")) {
            System.out.println("U've typed '2' ");
            System.out.println("Type the name of month");
            // Присвоєння змінній scanner
            input = sc.nextLine();
            /*
             * Оголошення циклу, щоб пройтись по всіх значеннях enum
             */
            for (Months item : Months.values()) {
                // Перевірка чи збігається введена назва з назвою константи з Enum
                if (input.equalsIgnoreCase(item.name())) {
                    System.out.println(item.seasons);
                } else {
                    throw new WrongInputParameter("Unfair play");
                }
            }


        } else if (menu.equals("3")) {
            System.out.println("U've typed '3' ");
            System.out.println("Type the name of month");
            // Присвоєння змінній scanner
            input = sc.nextLine();
            // Оголошення змінної, в яку будуть зберігатись значення enum
            Months saved = null;
            /*
             * Оголошення циклу, щоб пройтись по всіх значеннях enum
             */
            for (Months item : Months.values()) {
                // Перевірка чи збігається введена назва з назвою константи з Enum
                if (input.equalsIgnoreCase(item.name())) {
                    // Збереження значень enum в змінній saved
                    saved = item;
                } else {
                    throw new WrongInputParameter("Unfair play");
                }
            }
            /*
             * Оголошення циклу,порівняння значень в збереженій змінній та значеннях enum
             */
            for (Months item : Months.values()) {
                // Порівння значень
                if (saved.getDays() < item.getDays()) {
                    System.out.println(item.name());
                }
            }
        } else if (menu.equals("4")) {
            System.out.println("U've typed '4' ");
            System.out.println("Type the name of month");
            // Присвоєння змінній scanner
            input = sc.nextLine();
            // Оголошення змінної, в яку будуть зберігатись значення enum
            Months saved = null;
            /*
             * Оголошення циклу, щоб пройтись по всіх значеннях enum
             */
            for (Months item : Months.values()) {
                // Перевірка чи збігається введена назва з назвою константи з Enum
                if (input.equalsIgnoreCase(item.name())) {
                    saved = item;
                } else {
                    throw new WrongInputParameter("Unfair play");
                }
            }
            /*
             * Оголошення циклу,порівняння значень в збереженій змінній та значеннях enum
             */
            for (Months item : Months.values()) {
                if (saved.getDays() > item.getDays()) {
                    System.out.println(item.name());
                }
            }
        } else if (menu.equals("5")) {
            System.out.println("U've typed '5' ");
            System.out.println("Type the name of season");
            // Присвоєння змінній scanner
            input = sc.nextLine();
            // Перевірка чи збігається введена назва з назвою константи з Enum
            if (input.equalsIgnoreCase("winter")) {
                System.out.println("Autumn");
            } else if (input.equalsIgnoreCase("spring")) {
                System.out.println("Summer");
            } else if (input.equalsIgnoreCase("summer")) {
                System.out.println("Autumn");
            } else if (input.equalsIgnoreCase("Autumn")) {
                System.out.println("winter");
            } else {
                throw new WrongInputParameter("Unfair play");
            }
        } else if (menu.equals("6")) {
            System.out.println("U've typed '6' ");
            System.out.println("Type the name of season");
            // Присвоєння змінній scanner
            input = sc.nextLine();
            // Перевірка чи збігається введена назва з назвою константи з Enum
            for (Months item : Months.values()) {
                if (input.equalsIgnoreCase("winter")) {
                    System.out.println("Autumn");
                    System.out.println(item.getSeasons().values());
                } else if (input.equalsIgnoreCase("spring")) {
                    System.out.println("Winter");
                } else if (input.equalsIgnoreCase("summer")) {
                    System.out.println("Spring");
                } else if (input.equalsIgnoreCase("Autumn")) {
                    System.out.println("Summer");
                } else {
                    throw new WrongInputParameter("Unfair play");
                }
            }
        } else if (menu.equals("7")) {
            System.out.println("U've typed '7' ");
            /*
             * Оголошення циклу, щоб пройтись по всіх значеннях enum
             */
            for (Months item : Months.values()) {
                // Перевірка на парність
                if (item.days % 2 == 0) {
                    System.out.println(item.name());

                }
            }
        } else if (menu.equals("8")) {
            System.out.println("U've typed '8' ");
            /*
             * Оголошення циклу, щоб пройтись по всіх значеннях enum
             */
            for (Months item : Months.values()) {
                // Перевірка на парність
                if (item.days % 2 != 0) {
                    System.out.println(item.name());
                }
            }
        } else if (menu.equals("9")) {
            System.out.println("U've typed '9' ");
            System.out.println("Enter the name of month");
            // Присвоєння змінній scanner
            input = sc.nextLine();
            /*
             * Оголошення циклу, щоб пройтись по всіх значеннях enum
             */
            for (Months item : Months.values()) {
                // Перевірка чи збігається введена назва з назвою константи з Enum
                if (input.equalsIgnoreCase(item.name())) {
                    // Перевірка на парність
                    if (item.days % 2 == 0) {
                        System.out.println("Місяць має парну кількість днів");
                    } else if (item.days % 2 != 0) {
                        System.out.println("Місяць має непарну кількість днів");
                    }
                } else {
                    throw new WrongInputParameter("Unfair play");
                }
            }
        }
    }
}
