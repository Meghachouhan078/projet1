package collections.Queue_Interface;

import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class abstractQueue {
    public static void main(String[] args)
    {
        AbstractQueue<Integer> a = new LinkedBlockingQueue <Integer>();

        a.add(1);
        a.add(2);
        a.add(3);

        System.out.println("AbstractQueue : " + a);
    }
}