package collections.Queue_Interface;

import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferquue {
    public static void main(String[] args)
            throws InterruptedException
    {
        LinkedTransferQueue<Integer> LTQ = new LinkedTransferQueue<Integer>();
        LTQ.add(7855642);
        LTQ.add(35658786);
        LTQ.add(5278367);
        LTQ.add(74381793);

        System.out.println("Linked Transfer Queue1: " + LTQ);

        LinkedTransferQueue<Integer> LTQ2 = new LinkedTransferQueue<Integer>(LTQ);
        System.out.println("Linked Transfer Queue2: " + LTQ2);
    }
}
