package homework7;


public class Main {
    public static void main(String[] args) {
        Su_27 su = new Su_27(1000,"Wheet");
        System.out.println("We are taking off in: " + su.engineOn() + " Seconds");
        System.out.println("We've preventively calculateted that plane can withstand: " + su.takeOff() + " Miles");
        System.out.println("We are moving forward for: " + su.moveForward() + " Miles");
        System.out.println("We are moving backword for: " + su.moveBackward() + " Miles");
        System.out.println("We are moving upward for: " + su.moveUp() + " Miles");
        System.out.println("We are moving downward for: " + su.moveDown() + " Miles");
        System.out.println("We are invisible for: " + su.stealth() + " Seconds");
        System.out.println("The quantity of nuclear missiles is: " + su.nuclearStrike() + " Unit(s)");
        System.out.println("Tubro has been enabled. The boosted speed is now: " + su.turbo() + " Ml/Hr");
        su.runForrestrun();
        System.out.println(su.landing());
    }
}
