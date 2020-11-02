package homework14.task2;

import homework13.Deputy;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Commodity {
    Scanner sc = new Scanner(System.in);

    String name;
    int height;
    int weight;
    int length;

    public Commodity(String name, int height, int weight, int length) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", length=" + length +
                '}';
    }

}
