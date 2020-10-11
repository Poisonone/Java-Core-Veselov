package homework7;

public abstract class Plane {
    public int weight;
    public int length;
    public int width;
    ControlSystem ControlSystem = new ControlSystem();

    public Plane(){

    }
    public Plane(int weight, int length, int width) {
        this.weight = weight;
        this.length = length;
        this.width = width;
    }

    public double engineOn(){
       return (int)(20 + Math.random()*69);
    }
    public double takeOff(){
        return Math.random()*1001;
    }
    public String landing(){
        return "We are landing!Thank God we are still alive";
    }
    public int moveUP(){
        return ControlSystem.moveUP();
    }
    public int moveDown(){
        return ControlSystem.moveDown();
    }
    public int moveForward(){
        return ControlSystem.moveForward();
    }
    public int moveBackward(){
        return ControlSystem.moveBackward();
    }
    public void runForrestrun(){
        System.out.println("This your last chance,Forest. RUN!!!!!");
    }

}
