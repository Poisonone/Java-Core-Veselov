package homework4robot;

public class mainRobot {
    public static void main(String[] args) {
        Robot rb = new Robot();
        CoffeeRobot rb1 = new CoffeeRobot();
        RobotDancer rb2 = new RobotDancer();
        RobotCoocker rb3 = new RobotCoocker();
        rb.work();
        rb1.work();
        rb2.work();
        rb3.work();

        String[] rb4 = {"CoffeRobot","RobotDancer","RobotCoocker"};
        for(int i=0;i< rb4.length;i++){
            System.out.println(rb4[i]);
            if(rb4[i].equals("CoffeRobot")){
                rb1.work();
            }
            else if(rb4[i].equals("RobotDancer")){
                rb2.work();
            }
            else if(rb4[i].equals("RobotCoocker")){
                rb3.work();
            }
        }
    }
}
