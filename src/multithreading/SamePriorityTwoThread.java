package multithreading;

public class SamePriorityTwoThread extends Thread {
    public void run() {
        System.out.println("inside run method");
    }

    public static void main(String args[]) {
        Thread.currentThread().setPriority(7);
        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());
        SamePriorityTwoThread th1 = new SamePriorityTwoThread();

        System.out.println("Priority of the thread th1 is : " + th1.getPriority());
    }
}