package multithreading;

public class SetPriority extends Thread{

   public SetPriority(String name){
       super(name);
   }
    public void run() {
        for(int i=0;i<5;i++){
            String a="";
          for(int j=0;j<1000000000;j++){
                a+="a";
            }
            System.out.println(Thread.currentThread().getName() +" - Priority" + Thread.currentThread().getPriority() + "- count: "+ i);
         try{
             Thread.sleep(100);
         }catch(Exception e){

         }

        }

    }
    public static void main(String[] args)throws InterruptedException {
        SetPriority l=new SetPriority("Low priority thread");
        SetPriority m=new SetPriority("Medium priority thread");
        SetPriority h=new SetPriority("High priority thread");

        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();
    }
}
