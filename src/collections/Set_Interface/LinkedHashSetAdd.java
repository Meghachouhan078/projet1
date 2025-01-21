package collections.Set_Interface;

import java.util.LinkedHashSet;

public class LinkedHashSetAdd {
    public static void main(String[] args) {

        LinkedHashSet<String> lh = new LinkedHashSet<String>();

        lh.add("Geek");
        lh.add("For");
        lh.add("Geeks");

        System.out.println("LinkedHashSet : " + lh);
    }
}

