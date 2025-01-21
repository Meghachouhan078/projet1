package collections.Queue_Interface;

import java.util.concurrent.ConcurrentLinkedQueue;

public class methodsconcurrent {
    public static void main(String[] args)
    {
        ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue<Integer>();

        clq.add(12);
        clq.add(70);
        clq.add(1009);
        clq.add(475);

        System.out.println("ConcurrentLinkedQueue: " + clq);
        System.out.println("First Element is: " + clq.peek());
        System.out.println("Head Element is: " + clq.poll());

        System.out.println("ConcurrentLinkedQueue: " + clq);
        System.out.println("Size: " + clq.size());
    }
}

