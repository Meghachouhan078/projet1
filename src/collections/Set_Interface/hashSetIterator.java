package collections.Set_Interface;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetIterator {
    public static void main(String[]args){

        HashSet<String> hs=new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        System.out.print(("using iteraror:"));
        Iterator<String> iterator=hs.iterator();

        while(iterator.hasNext())
            System.out.print(iterator.next() + ",");
        System.out.println();

        System.out.print("using enhanced forloop:");
        for(String element:hs)
            System.out.print(element+" ,");
    }

}
