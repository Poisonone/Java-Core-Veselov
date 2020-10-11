package homework7;

public class Su_27 extends Plane implements AdditionalPossibilities{

    @Override
    public double turbo() {
        return 1000+Math.random()*2001;
    }

    @Override
    public double stealth() {
        return (int)(1+Math.random()*15001);
    }

    @Override
    public int nuclearStrike() {
        return 1+ (int) ( Math.random() * 10 );
    }

    int maxSpeed;
    String color;

    public Su_27(int maxSpeed, String color) {
        this.maxSpeed = maxSpeed;
        this.color = color;
    }
    //    public Su_27(int maxSpeed,String color){
//        this.maxSpeed = maxSpeed;
//        this.color = color;
//    }


}
