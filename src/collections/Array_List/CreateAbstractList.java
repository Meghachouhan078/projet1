package collections.Array_List;

import java.util.AbstractList;
import java.util.LinkedList;

public class CreateAbstractList {
    public static void main(String[] args) {


        AbstractList<String> list = new LinkedList<String>();

        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("10");
        list.add("20");

        System.out.println("AbstractList: " + list);

        list.remove(3);
        System.out.println("Final AbstractList: " + list);
        int lastindex = list.lastIndexOf("A");


        System.out.println("Last index of A : " + lastindex);
    }
}
