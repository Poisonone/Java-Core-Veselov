package Homework4.Animal;

public class animalMain {
    public static void main(String[] args) {
        animal an =new animal("Shurik",150,5);
        System.out.println(an.toString());
        an.setAge(25);
        an.setName("Ne-Shurik");
        an.setSpeed(149);
        System.out.println("---------------------------------------");
        System.out.println(an.toString());
    }
}
