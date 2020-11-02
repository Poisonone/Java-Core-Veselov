package homework11.task2;

import java.util.*;


public class Wheel {
    int diameter = (int) (Math.random() * 100);
    List<String> myList = Arrays.asList("Wool", "Leather", "Cloth", "Some_Material");
    Random r = new Random();
    int randomitem = r.nextInt(myList.size());
    String Material = myList.get(randomitem);

    public Wheel(int diameter, String material) {
        this.diameter = diameter;
        Material = material;
    }


}
