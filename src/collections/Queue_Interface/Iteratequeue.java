package collections.Queue_Interface;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Iteratequeue {
    public static void main(String args[]) {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");
        Iterator I = pq.iterator();
        while (I.hasNext()) {
            System.out.println(I.next() + " ");
        }
    }
}
