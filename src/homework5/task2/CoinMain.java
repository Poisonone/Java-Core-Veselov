package homework5.task2;

public class CoinMain {
    public static void main(String[] args) {
        int x = 10+(int)(Math.random()*41);
        if(x<20){
            System.out.println("Випав Avers, " + "X = " + x);
        }
        else{
            System.out.println("Випав Revers, " + "X = " + x);
        }
    }
}
