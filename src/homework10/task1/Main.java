package homework10.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word of 5 letters");
        String str = sc.nextLine();
        if (str.length() == 5) {
            if (str.toLowerCase().charAt(0) == (str.toLowerCase().charAt(4)) && (str.toLowerCase().charAt(1) == (str.toLowerCase().charAt(3)))) {
                System.out.println("U've done it");
            } else {
                System.out.println("U can try it one more time");
            }
        } else {
            throw new RuntimeException("Only 5 letters");
        }

    }
}
