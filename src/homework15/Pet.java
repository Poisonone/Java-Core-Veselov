package homework15;

public class Pet extends Animal {
    public Pet(String name, String type) {
        super(name, type);
    }


    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

}
