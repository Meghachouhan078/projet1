package collections.Set_Interface;

import java.util.HashSet;
import java.util.Set;

public class IluustrateSetInterface {
    public static void main(String[] args)
    {
        Set<String> s = new HashSet<String>();
        s.add("Geeks");
        s.add("For");
        s.add("Geeks");
        s.add("Example");
        s.add("Set");
        System.out.println(s);
    }
}

