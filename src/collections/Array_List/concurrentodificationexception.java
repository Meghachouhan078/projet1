package collections.Array_List;

import java.util.ArrayList;
import java.util.Iterator;

public class concurrentodificationexception {
    public static void main(String args[])
    {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("One");
        arr.add("Two");
        arr.add("Three");
        arr.add("Four");

        try {
            System.out.println("ArrayList: ");
            Iterator<String> iter = arr.iterator();
            while (iter.hasNext()) {
                System.out.print(iter.next() + ", ");
                // ConcurrentModificationException

                System.out.println("\nTrying to add" + " an element in " + "between iteration\n");
                arr.add("Five");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
