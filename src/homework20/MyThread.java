package homework20;

import java.util.Scanner;

public class MyThread extends Thread {
    @Override
    public void run() {
        int n0 = 1;
        int n1 = 1;
        int n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of the numbers: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        if (quantity == 1) {
            System.out.println(n0);
        } else if (quantity == 2) {
            System.out.print(n0 + " " + n1 + " ");

        } else {
            System.out.print(n0 + " " + n1 + " ");
            for (int i = 3; i <= quantity; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n2 = n0 + n1;
                System.out.print(n2 + " ");
                n0 = n1;
                n1 = n2;
            }
            System.out.println();
        }
    }
}
