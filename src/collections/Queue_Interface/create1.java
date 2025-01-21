package collections.Queue_Interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class create1 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        System.out.println("element"+deque);
        int first = deque.removeFirst();
        int last = deque.removeLast();
        System.out.println("First: " + first + ", Last: " + last);
    }
}

