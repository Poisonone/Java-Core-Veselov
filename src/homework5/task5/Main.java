package homework5.task5;

public class Main {
    public static void main(String[] args) {
        Amphibia fr = new Frog();
        fr.eat();
        fr.sleep();
        fr.swim();
        fr.walk();
        System.out.println("--------------------------------------------------");
        Frog fr1 = new Frog();
        ((Amphibia)fr1).walk();
        ((Amphibia)fr1).sleep();
        ((Amphibia)fr1).eat();
        ((Amphibia)fr1).swim();
    }

}
