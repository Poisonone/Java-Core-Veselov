package homework11.task2;

import java.util.*;


public class Wheel {
    int diameter;
    List<String> myList = Arrays.asList("Wool", "Leather", "Cloth", "Some_Material");
    String material;

    public Wheel(int diameter, String material) {
        this.diameter = diameter;
        this.material = material;
    }

    public Wheel() {
        diameter = (int) (Math.random() * 50);
        Random r = new Random();
        int randomitem = r.nextInt(myList.size());
        material = myList.get(randomitem);
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                '}';
    }
}
