package homework13;

public class Human {
    int weight;
    int height;
    int age;

    public Human(int weight, int height, int age) {
        this.weight = weight;
        this.height = height;
        this.age = age;

    }

    public Human() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Human{" +
                "weight=" + weight +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
