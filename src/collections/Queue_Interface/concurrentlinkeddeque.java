package collections.Queue_Interface;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class concurrentlinkeddeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ConcurrentLinkedDeque<>();
        deque.addFirst(1);
       deque.addLast(2);
        int first = deque.pollFirst();
        int last = deque.pollLast();
        System.out.println("First: " + first + ", Last: " + last);
    }
}

