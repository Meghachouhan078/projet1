package collections.Queue_Interface;

import java.util.concurrent.PriorityBlockingQueue;

public class priorityblkingqueue {
    public static void main(String[] args)
    {

        PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>();

        pbq.add(1);
        pbq.add(2);
        pbq.add(3);
        pbq.add(4);
        pbq.add(5);

        System.out.println("PriorityBlockingQueue:" + pbq);
    }
}
