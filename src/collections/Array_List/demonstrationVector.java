package collections.Array_List;

import java.util.LinkedList;
import java.util.Vector;

public class demonstrationVector {
    public static void main(String[] args) {
        int n = 5;
        Vector<Integer> v = new Vector<Integer>(n);

        //append new elements at vector end
        for (int i = 1; i <= n; i++) {
            v.add(i);
        }
            System.out.println(v);
            v.remove(3);
            System.out.println(v);
            for (int i = 0; i <= v.size(); i++) {
                System.out.print(v.get(i) + " ");
            }


        }

    public static class iterateLinkedList {
        public static void main(String args[])
        {
            LinkedList<String> l= new LinkedList<>();

            l.add("Geeks");
            l.add("Geeks");
            l.add(1, "For");

            // Using the Get method and the
            // for loop
            for (int i = 0; i < l.size(); i++) {

                System.out.print(l.get(i) + " ");
            }

            System.out.println();

            // Using the for each loop
            for (String str : l)
                System.out.print(str + " ");
        }
    }
}
