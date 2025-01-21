package collections.Queue_Interface;
import java.util.concurrent.ArrayBlockingQueue;
public class removeArrayBlokingQueue {
    public static void main(String[]args){
        int capacity=15;
        ArrayBlockingQueue<Integer> ABQ=new ArrayBlockingQueue<Integer>(capacity);
              ABQ.add(1);
              ABQ.add(2);
              ABQ.add(3);
              ABQ.add(4);
        System.out.println("ArrayBlockingQueue:" + ABQ);
        //boolean response = ABQ.remove(2);
      //  System.out.println("Removal of 2 :" + response);

        ABQ.remove();

        System.out.println("elemet is"+ABQ);

        System.out.println("queue contains " + ABQ);
        ABQ.clear();
        System.out.println("ArrayBlockingQueue:" + ABQ);
    }
}
