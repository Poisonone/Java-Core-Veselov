package homework4car;

public class mainCar {
    public static void main(String[] args) {
    Helm hm = new Helm(25);
    Wheel wl = new Wheel(15);
    Body bd = new Body(12);
    Car car = new Car(wl,bd,hm);
    System.out.println(hm.toString());
    hm.setHelm(100);
    wl.setWheel(150);
    bd.setBody(10);
    System.out.println(car.toString());
    }
}
