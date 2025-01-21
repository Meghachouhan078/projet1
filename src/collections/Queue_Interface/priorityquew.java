package collections.Queue_Interface;

import java.util.PriorityQueue;

public class priorityquew {
    public static void main(String[] args)
    {
        PriorityQueue<Integer> p = new PriorityQueue<>();

        p.add(3);
        p.add(10);
        p.add(7);
        p.add(2);
        System.out.println("elements of queue are"+p);
        System.out.println("Head of Queue : " + p.peek());

    }
}

