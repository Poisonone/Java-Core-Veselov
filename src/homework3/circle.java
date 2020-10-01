package homework3;

public class circle {
    float radius;
    float diameter;

    public circle(float radius,float diameter){
        this.diameter=diameter;
        this.radius=radius;
    }
    public double length(){
        return 2*3.14*radius;
    }
    public double area(){
        return 3.14*Math.pow(diameter/2,2);
    }
}
