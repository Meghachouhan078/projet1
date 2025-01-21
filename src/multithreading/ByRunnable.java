package multithreading;

public class ByRunnable implements Runnable{
    public void run(){
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        ByRunnable m2= new ByRunnable();
        Thread t1=new Thread(m2); //using the constructor Thread(Runnable r)
        t1.start();
    }
}
