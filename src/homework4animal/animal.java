package homework4animal;

public class animal {
    private String name;
    private int speed;
    private int age;

    public animal(String name, int speed, int age) {
        this.name = name;
        this.speed = speed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return
                "Назва тварини='" + name + '\'' +
                ", Швидкість=" + speed +
                ", Вік=" + age
                ;
    }
}
