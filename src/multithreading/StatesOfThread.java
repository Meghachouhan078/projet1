package multithreading;

public class StatesOfThread extends Thread {
    public void run(){
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        StatesOfThread t1=new StatesOfThread();
        System.out.println((t1.getState()));
        t1.start();
        System.out.println(t1.getState());
       // System.out.println(Thread.currentThread().getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
    }
}
