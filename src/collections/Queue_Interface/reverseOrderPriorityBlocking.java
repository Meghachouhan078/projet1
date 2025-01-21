package collections.Queue_Interface;

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

public class reverseOrderPriorityBlocking {
    public static void main(String[] args)
    {
        int capacity = 15;
        PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>(capacity, Comparator.reverseOrder());

        pbq.add(1);
        pbq.add(2);
        pbq.add(3);

        System.out.println("PriorityBlockingQueue:" + pbq);
    }
}

