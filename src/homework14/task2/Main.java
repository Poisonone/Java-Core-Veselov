package homework14.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Methods obj = new Methods();
        System.out.println("===============CONSOLE MENU==================\n" +
                "1  Додати товар\n" +
                "2  Видалити товар\n" +
                "3  Замінити товар\n" +
                "4  Сортувати за назвоню\n" +
                "5  Сортувати за довжиною\n" +
                "6  Сортувати за висотою\n" +
                "7  Сортувати за вагою\n" +
                "8  Виводимо і-тий елемент колекції\n" +
                "9  Вийти з програми");
        String input = sc.nextLine();
        switch (input) {
            case "1": {
                obj.addNewProduct();
                break;
            }
            case "2": {
                obj.removeTheProduct();
                break;
            }
            case "3": {
                obj.switchTheProduct();
                break;
            }
            case "4": {
                obj.filterByName();
                break;
            }
            case "5": {
                obj.filterByLength();
                break;
            }
            case "6": {
                obj.filterByHeight();
                break;
            }
            case "7": {
                obj.filterByWeight();
                break;
            }
            case "8": {
                obj.findTheProduct();
                break;
            }
            case "9": {
                obj.exitFromTheMenu();
            }
        }
    }
}
