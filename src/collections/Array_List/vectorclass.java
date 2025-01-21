package collections.Array_List;

import java.util.Vector;

public class vectorclass {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(3, 2);
        //add elemnt
        v.add(1);
        v.add(2);
        v.add(3);
        //insert element at index 1
        v.insertElementAt(0, 1);
        //remove element at 2
        v.remove(2);
        for (int i : v) {
            System.out.println(i);
        }
    }
}