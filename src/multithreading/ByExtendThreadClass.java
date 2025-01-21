package multithreading;

public class ByExtendThreadClass extends Thread{
    public void run(){
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        ByExtendThreadClass m1=new ByExtendThreadClass();
        m1.start();
    }
}
