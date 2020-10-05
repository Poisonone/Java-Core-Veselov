package homework4car;

public class mainCar {
    public static void main(String[] args) {
        Wheel wheel = new Wheel(25);
        Car car = new Car (wheel);
        System.out.println(car.toString());

    }
}
