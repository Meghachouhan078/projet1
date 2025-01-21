package collections.Queue_Interface;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlokingQueue {

    public static void main(String[] args)
    {
        int capacity = 15;
        ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<Integer>(capacity);
        abq.add(1);
        abq.add(2);
        abq.add(3);

        System.out.println("ArrayBlockingQueue:" + abq);
    }
}

