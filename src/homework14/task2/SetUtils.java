package homework14.task2;

import java.util.*;

public class SetUtils {
    Scanner sc = new Scanner(System.in);
    Commodity commodity;
    Set<Commodity> set;

    public SetUtils(Set<Commodity> set) {
        this.set = set;
    }

    public Set addNewProduct() {
        System.out.println("Enter the name of the product");
        String inputName = sc.nextLine();
        System.out.println("Enter the length of the product:");
        int inputLength = sc.nextInt();
        System.out.println("Enter the weight of the product:");
        int inputWeight = sc.nextInt();
        System.out.println("Enter the height of the product:");
        int inputHeight = sc.nextInt();
        set.add(new Commodity(inputName, inputHeight, inputWeight, inputLength));
        return set;
    }

    public Set removeTheProduct() {
        Iterator value = set.iterator();
        System.out.println("Enter the name of the product u wanna switch: ");
        String inputName = sc.nextLine();
        while (value.hasNext()) {
            if (inputName.equalsIgnoreCase(commodity.getName())) {
                value.remove();
            }
        }
        return set;
    }

    public Set switchTheProduct() {
        Iterator value = set.iterator();
        System.out.println("Enter the name of the product u wanna switch: ");
        String inputName1 = sc.nextLine();
        System.out.println("Enter the name of a new product");
        String inputName = sc.nextLine();
        System.out.println("Enter the length a new product:");
        int inputLength = sc.nextInt();
        System.out.println("Enter the weight a new product:");
        int inputWeight = sc.nextInt();
        System.out.println("Enter the height a new product:");
        int inputHeight = sc.nextInt();
        while (value.hasNext()) {
            if (inputName1.equalsIgnoreCase(commodity.getName())) {
                value.remove();
                set.add(new Commodity(inputName, inputHeight, inputWeight, inputLength));

            }
        }
        return set;
    }

    public Set filterByName() {

        FilteredByName filteredByNameComparator = new FilteredByName();
        Set<Commodity> set = new TreeSet<>(filteredByNameComparator);
        return set;
    }

    public Set filterByWeight() {
        FilteredByWeight filteredByWeightComparator = new FilteredByWeight();
        Set<Commodity> set = new TreeSet<>(filteredByWeightComparator);
        return set;
    }

    public Set filterByHeight() {
        FilteredByHeight filteredByHeightComparator = new FilteredByHeight();
        Set<Commodity> set = new TreeSet<>(filteredByHeightComparator);
        return set;
    }

    public Set filterByLength() {
        FilteredByLength filteredByLengthComparator = new FilteredByLength();
        Set<Commodity> set = new TreeSet<>(filteredByLengthComparator);
        return set;
    }

    public void findTheProduct() {
        System.out.println("Enter the name of the product u wanna find: ");
        String inputName1 = sc.nextLine();
        for (Commodity i : set) {
            if (inputName1.equalsIgnoreCase(i.getName())) {
                System.out.println(i);
            }
        }
    }

    public void exitFromTheMenu() {
        System.exit(0);
    }

}