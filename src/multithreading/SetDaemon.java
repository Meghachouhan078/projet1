package multithreading;

public class SetDaemon extends Thread{
    public void run(){
        while(true){
            System.out.println("hello world");
        }
    }
    public static void main(String[]args){
        SetDaemon t1=new SetDaemon();
        t1.setDaemon(true);
        t1.start();
        System.out.println("main done");
    }
}
