package Homework8.task3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String en1;
        String en2;
       for( int i=0 ; i>-1 ; i++){
           System.out.println("Enter first number");
           en1 = sc.nextLine();
           if(en1.equals("q")){
               System.out.println("Unfair play");
               break;
           }
           System.out.println("Enter second number");
           en2 = sc.nextLine();
           int in1 = Integer.parseInt(en1);
           int in2 = Integer.parseInt(en2);
           int sum = in1+in2;
           System.out.println("Sum is : " + sum);
       }


    }
}
