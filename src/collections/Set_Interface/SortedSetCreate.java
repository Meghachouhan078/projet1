package collections.Set_Interface;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetCreate {
    public static void main(String[] args)
    {
        SortedSet<String> ts = new TreeSet<String>();

        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("A");

        System.out.println(ts);
    }
}
