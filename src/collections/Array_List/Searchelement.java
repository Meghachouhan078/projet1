package collections.Array_List;

import java.util.ArrayList;
import java.util.List;

public class Searchelement {
    public static void main(String[] args)
    {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(2);

        int i = al.indexOf(2);

        System.out.println("First Occurrence of 2 is at Index: "+i);

        int l = al.lastIndexOf(2);

        System.out.println("Last Occurrence of 2 is at Index: "+l);
    }
}

