package collections.Queue_Interface;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlokingQueue {

    public static void main(String[] args)
    {
        LinkedBlockingQueue<Integer> lbq = new LinkedBlockingQueue<Integer>();
        lbq.add(1);
        lbq.add(2);
        lbq.add(3);
        lbq.add(4);
        lbq.add(5);
        System.out.println("LinkedBlockingQueue:" + lbq);
    }
}

