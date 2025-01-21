package collections.Array_List;

import java.util.AbstractList;
import java.util.ArrayList;

public class AbstractListDemo {
    public static void main(String[]args){
        AbstractList<String> list = new ArrayList<String>();

        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("10");
        list.add("20");

        System.out.println("AbstractList:" + list);
    }
}

