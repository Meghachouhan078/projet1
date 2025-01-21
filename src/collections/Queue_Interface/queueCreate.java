package collections.Queue_Interface;
import java.util.LinkedList;
import java.util.Queue;

public class queueCreate {
    public static void main(String[]args){

        Queue <String> q =new LinkedList();

        q.add("apple");
        q.add("banana");
        q.add("mango");

        System.out.println("Queue is"+ q);
        String front= q.remove();
        System.out.println(" removed element is:"+ front);
        System.out.println(" After remove Queue is"+ q);

        q.add("date");
        String peeked=q.peek();
        System.out.println("Peeked element: " + peeked);
        System.out.println("Queue after peek: " + q);

    }
}
