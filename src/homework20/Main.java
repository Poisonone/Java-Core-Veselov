package homework20;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        MyRunnable myRunnable = new MyRunnable();
        myThread.start();
        myThread.join();
        System.out.println("---------------------");
        new Thread(myRunnable).start();

    }
}
