package homework11.task2;

public class Car {

    int hp;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    int year;
    Wheel wheel;
    Engine engine;

    public Car(int hp, int year, Wheel wheel, Engine engine) {
        this.hp = hp;
        this.year = year;
        this.wheel = wheel;
        this.engine = engine;
    }

    public Car() {
        int hp = (int) (Math.random() * 500);
        int year = (int) (Math.random() * 2021) - 100;
        wheel = new Wheel();
        engine = new Engine();
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
