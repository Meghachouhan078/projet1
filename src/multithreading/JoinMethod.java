package multithreading;

public class JoinMethod extends Thread{
    public void run(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }


    }

    public static void main(String[] args) throws InterruptedException {
        JoinMethod t1=new JoinMethod();
        t1.start();
        t1.join();
        System.out.println("Hello");
    }
}
