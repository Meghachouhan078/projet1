package collections.Queue_Interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class createDeque {
    public static void main(String[]args){
        Deque<String> d=new ArrayDeque<>();

        d.addFirst("megha");
        d.addLast("mr");
        System.out.println("element"+d);
        String f=d.removeFirst();
        String l=d.removeLast();
        System.out.println("First: " + f + ", Last: " + l);

    }
}
