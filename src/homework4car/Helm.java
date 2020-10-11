package homework4car;

public class Helm  {
    private int Diameter = 10;

    public Helm(int Diameter){
        this.Diameter = Diameter;
    }

    public int getHelm() {
        return Diameter;
    }

    public void setHelm(int diameter) {
        Diameter = diameter;
    }
    public int Diameterminus(){
        return Diameter/2;
    }
    @Override
    public String toString() {
        return "Helm{" +
                "Diameter=" + Diameter +
                '}';
    }
}
