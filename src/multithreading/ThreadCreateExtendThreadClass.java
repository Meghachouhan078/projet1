package multithreading;

public class ThreadCreateExtendThreadClass extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId()+ " is running");

        } catch (Exception e) {
            System.out.println("exception is caught");
        }
    }
}
class multithread {
    public static void main(String[] args) {

        int n = 8;
        for (int i = 0; i < n; i++) {
            ThreadCreateExtendThreadClass tc = new ThreadCreateExtendThreadClass();
            tc.start();
        }
    }
}