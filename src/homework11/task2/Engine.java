package homework11.task2;

public class Engine {
    int cylinders;

    public Engine(int cylinders) {
        this.cylinders = cylinders;
    }

    public Engine() {
        cylinders = (int) (Math.random() * 6);
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cylinders=" + cylinders +
                '}';
    }
}
