package collections.Queue_Interface;

import java.util.LinkedList;
import java.util.Queue;

public class queueCreate1 {
    public static void main(String[]args){
        Queue<Integer> qq=new LinkedList<>();

        for(int i=0;i<=5;i++)
            qq.add(i);
        System.out.println("Elements of queue " + qq);

        int removed = qq.remove();
        System.out.println("removed element:" + removed);

        System.out.println(qq);
        int head = qq.peek();
        System.out.println("head of queue:" + head);
        int size = qq.size();
        System.out.println("Size of queue:" + size);
    }
}

