package collections.Queue_Interface;

import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class removequeue {
    public static void main(String[] args) {
        AbstractQueue <Integer>AQ1 = new LinkedBlockingQueue<Integer>();

        AQ1.add(10);
        AQ1.add(20);
        AQ1.add(30);
        AQ1.add(40);
        AQ1.add(50);
        System.out.println("queue elements" +AQ1);
        int head=AQ1.remove();
        System.out.println("head"+head);
        System.out.println("after remove of head"+AQ1);
        AQ1.clear();
        System.out.println("AbstractQueue1 : " + AQ1);
    }
}