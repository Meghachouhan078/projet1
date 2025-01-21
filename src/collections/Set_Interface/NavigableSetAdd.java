package collections.Set_Interface;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetAdd {

    public static void main(String[] args) {
        NavigableSet<String> ts = new TreeSet<String>();

        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("A");

        System.out.println(ts);
    }
}
