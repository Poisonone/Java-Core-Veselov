package homework10.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter the sentence:");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        System.out.println(words.length);
    }

}
