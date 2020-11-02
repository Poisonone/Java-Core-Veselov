package homework14.task2;

import java.util.*;

public class Methods {
    Scanner sc = new Scanner(System.in);
    Commodity commodity;


    public void addNewProduct() {
        Set<Commodity> set = new TreeSet<>();
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
        Set<Commodity> set = new TreeSet<>();
        Iterator value = set.iterator();
        System.out.println("Enter the name of the product u wanna switch: ");
        String inputname = sc.nextLine();
        while (value.hasNext()) {
            if (inputname.equalsIgnoreCase(commodity.getName())) {
                value.remove();
            }
        }
    }

    public void switchTheProduct() {
        Set<Commodity> set = new TreeSet<>();
        Iterator value = set.iterator();
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

    public void filterByName() {
        FilteredByName filteredByNameComparator = new FilteredByName();
        Set<Commodity> set = new TreeSet<>(filteredByNameComparator);
        System.out.println(set);
    }

    public void filterByWeight() {
        FilteredByWeight filteredByWeightComparator = new FilteredByWeight();
        Set<Commodity> set = new TreeSet<>(filteredByWeightComparator);
        System.out.println(set);
    }

    public void filterByHeight() {
        FilteredByHeight filteredByHeightComparator = new FilteredByHeight();
        Set<Commodity> set = new TreeSet<>(filteredByHeightComparator);
        System.out.println(set);
    }

    public void filterByLength() {
        FilteredByLength filteredByLengthComparator = new FilteredByLength();
        Set<Commodity> set = new TreeSet<>(filteredByLengthComparator);
        System.out.println(set);
    }

    public void findTheProduct() {
        Set<Commodity> set = new TreeSet<>();
        System.out.println("Enter the name of the product u wanna find: ");
        String inputname1 = sc.nextLine();
        for (Commodity i : set) {
            if (inputname1.equalsIgnoreCase(i.getName())) {
                System.out.println(i);
            }
        }
    }

    public void exitFromTheMenu() {
        System.exit(0);
    }

}