package collections.Queue_Interface;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class producerConsumer {
    public static void main(String[]args) {
        BlockingQueue<Integer> bqueue = new ArrayBlockingQueue<Integer>(4);

        producer p1 = new producer(bqueue);
        consumer c1 = new consumer(bqueue);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(c1);
        t1.start();
        t2.start();
    }
}
    class producer implements Runnable {
        BlockingQueue<Integer> obj;

        public producer(BlockingQueue<Integer> obj) {
            this.obj = obj;
        }

        public void run() {
            for (int i = 1; i <= 4; i++) {
                try {
                    obj.put(i);
                    System.out.println("produced" + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class consumer implements Runnable {
        BlockingQueue<Integer> obj;
        int taken = -1;
        
        public consumer(BlockingQueue<Integer> obj) {
            this.obj = obj;
        }
        public void run() {
            while (taken != 4) {
                try {
                    taken = obj.take();
                    System.out.println("consumed" + taken);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }













