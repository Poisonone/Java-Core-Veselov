package homework9.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, MyException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        if (a == 0 && b == 0) {
            throw new IllegalAccessException();
        } else if (a > 0 && b > 0) {
            throw new MyException("U did it wrong!");
        } else if (a < 0 && b < 0) {
            throw new IllegalArgumentException();
        } else if (a != 0 && b == 0) {
            throw new ArithmeticException();
        } else if (a == 0 && b != 0) {
            throw new ArithmeticException();
        } else {
            System.out.println("Summa = " + sum(a, b));
            System.out.println("Riznutsya = " + subst(a, b));
            System.out.println("Mnozhennya = " + mult(a, b));
            System.out.println("Dilennya = " + div(a, b));

        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subst(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }
}
