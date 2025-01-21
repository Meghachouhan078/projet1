package collections.Set_Interface;

import java.util.HashSet;
import java.util.Set;

public class Addaelements {
    public static void main(String[] args)
    {
        Set<String> hs = new HashSet<String>();

        hs.add("B");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        System.out.println(hs);
    }
}
