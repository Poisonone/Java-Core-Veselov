package homework22.task3;

import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        formatter.format("Number in exponential form(double): %e", 12d);
        System.out.println(formatter.toString());
        Formatter formatter2 = new Formatter();
        formatter2.format("Number in exponential form(float): %e", 102f);
        System.out.println(formatter2.toString());
    }
}
