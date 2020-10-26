package homework11.task2;

public class Car {

    int hp = (int) (Math.random() * 500);
    int year = (int) (Math.random() * 2021) - 100;
    Wheel wheel;
    Engine engine;

    public Car(int hp, int year, Wheel wheel, Engine engine) {
        this.hp = hp;
        this.year = year;
        this.wheel = wheel;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "hp=" + hp +
                ", year=" + year +
                ", wheel=" + wheel +
                ", engine=" + engine +
                '}';
    }
}
