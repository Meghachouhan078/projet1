package collections.Array_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratelist {
    public static void main(String args[])
    {
        List<String> li = new ArrayList<>();

        li.add("c");
        li.add("Java");
        li.add("Python");
        li.add("DSA");
        li.add("C++");
        Iterator<String> cityIterator = li.iterator();

        while(cityIterator.hasNext())
        {
            System.out.println(cityIterator.next());
        }
    }
}

