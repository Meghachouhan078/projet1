package collections.Array_List;

import java.util.ArrayList;
import java.util.List;

public class AddList {
    public static void main(String args[])
    {
        List<String> al = new ArrayList<>();

        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "For");

        System.out.println(al);
    }
}
