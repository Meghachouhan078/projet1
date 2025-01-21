package multithreading;

public class ThreadpriorityExample  extends Thread{
    public void run(){
        System.out.println("Inside the run method");
    }

    public static void main(String[] args) {
        ThreadpriorityExample th1=new ThreadpriorityExample();
        ThreadpriorityExample th2=new ThreadpriorityExample();
        ThreadpriorityExample th3=new ThreadpriorityExample();

        System.out.println("priority of thread th1 is" + th1.getPriority());
        System.out.println("priority of thread th2 is" + th2.getPriority());
        System.out.println("priority of thread th3 is" + th3.getPriority());

        th1.setPriority(6);
        th2.setPriority(7);
        th3.setPriority(8);

        System.out.println("priority of thread th1 is" + th1.getPriority());//6
        System.out.println("priority of thread th2 is" + th2.getPriority());//5
        System.out.println("priority of thread th3 is" + th3.getPriority());//8

        // Displaying name of the currently executing thread
        System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());
        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);
        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());
    }

}

