package homework14.task2;

import java.util.*;

public class Main {
    Scanner sc = new Scanner(System.in);
    Commodity commodity;
    Set<Commodity> set = new TreeSet<>();
    Iterator value = set.iterator();


    public void addNewProduct() {
        System.out.println("Enter the name of the product");
        String inputname = sc.nextLine();
        System.out.println("Enter the length of the product:");
        int inputlength = sc.nextInt();
        System.out.println("Enter the weight of the product:");
        int inputweight = sc.nextInt();
        System.out.println("Enter the height of the product:");
        int inputheight = sc.nextInt();
        set.add(new Commodity(inputname, inputheight, inputweight, inputlength));
    }

    public void removeTheProduct() {
        System.out.println("Enter the name of the product u wanna switch: ");
        String inputname = sc.nextLine();
        if (inputname.equalsIgnoreCase(commodity.getName())) {
            value.remove();
        }
    }

    public void switchTheProduct() {
        System.out.println("Enter the name of the product u wanna switch: ");
        String inputname1 = sc.nextLine();
        System.out.println("Enter the name of a new product");
        String inputname = sc.nextLine();
        System.out.println("Enter the length a new product:");
        int inputlength = sc.nextInt();
        System.out.println("Enter the weight a new product:");
        int inputweight = sc.nextInt();
        System.out.println("Enter the height a new product:");
        int inputheight = sc.nextInt();
        while (value.hasNext()) {
            if (inputname1.equalsIgnoreCase(commodity.getName())) {
                value.remove();
                set.add(new Commodity(inputname, inputheight, inputweight, inputlength));
            }
        }
    }
}
