package homework20;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MyRunnable implements Runnable {
    @Override
    public void run() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of the numbers: ");
        System.out.println();
        int n = sc.nextInt();
        int a[] = new int[n];

        a[0] = 1;
        a[1] = 1;

        for (int i = 2; i < n; i++) {
            a[i] = a[i - 2] + a[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(a[i] + " ");
        }
    }
}
