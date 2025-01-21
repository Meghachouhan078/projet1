package multithreading;

public class InterruptMethod extends Thread {
    public void run() {
    try{
        Thread.sleep(1000);
        System.out.println("Thread is running...");
    } catch (InterruptedException e) {
        System.out.println("Thread interupted" + e);
    }
    }

    public static void main(String[] args) throws InterruptedException{
        InterruptMethod t1=new InterruptMethod();
        t1.start();
        t1.interrupt();
    }
}
