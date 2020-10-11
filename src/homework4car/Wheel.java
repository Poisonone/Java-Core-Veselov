package homework4car;

public class Wheel {

    int Radius = 10;

    public Wheel(int Radius){
    this.Radius=Radius;
    }

    public int getWheel() {
        return Radius;
    }

    public void setWheel(int Radius) {
        this.Radius = Radius;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "Radius=" + Radius +
                '}';
    }
}
