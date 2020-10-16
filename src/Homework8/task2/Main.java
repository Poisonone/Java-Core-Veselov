package Homework8.task2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer:");
        float entered = sc.nextFloat();
        if(entered % 1 == 0){
            if(entered % 2 == 0){
                System.out.println("Parne chyslo");
            }
            else{
                System.out.println("Neparne");
            }
        }
        else{
            System.out.println("Unfair play!:)");
        }
    }

}

