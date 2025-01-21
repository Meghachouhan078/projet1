package multithreading;

public class SleepMethod extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SleepMethod t1=new SleepMethod();
        t1.start();

    }
}
