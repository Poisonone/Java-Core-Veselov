package homework10.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sentencecount = 0;

        System.out.println("Enter the sentence:");
        String str = sc.nextLine();
        String[] sentence = str.split("\\.");
        System.out.println(sentence.length);

    }

}

