package collections.Queue_Interface;

import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class AccesongElement {
    public static void main(String[] argv)  {
        AbstractQueue<Integer> AQ1 = new LinkedBlockingQueue<Integer>();

        AQ1.add(10);
        AQ1.add(20);
        AQ1.add(30);
        AQ1.add(40);
        AQ1.add(50);

        System.out.println("AbstractQueue1 contains : " + AQ1);

        // access the head element
        System.out.println("head : " + AQ1.element());

    }
}