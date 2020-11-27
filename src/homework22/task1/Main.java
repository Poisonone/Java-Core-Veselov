package homework22.task1;

public class Main {
    public static void main(String[] args) {
        Pet dog = () -> System.out.println("Gav");
        Pet cat = () -> System.out.println("Meow");
        Pet cow = () -> System.out.println("idk");
        dog.callVoice();
        cat.callVoice();
        cow.callVoice();
    }
}
