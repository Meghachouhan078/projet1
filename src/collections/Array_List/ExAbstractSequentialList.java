package collections.Array_List;

import java.util.AbstractSequentialList;
import java.util.LinkedList;

public class ExAbstractSequentialList {
    public static void main(String[] args) {
        AbstractSequentialList<String> a = new LinkedList<String>();

        a.add("java");
        a.add("T");
        a.add("point");
        a.add("10");
        a.add("20");

        System.out.println("AbstractSequentialList: " + a);

        a.remove(3);

        System.out.println("Final List: " + a);
        System.out.println("the element is:" + a.get(2));
    }
}
