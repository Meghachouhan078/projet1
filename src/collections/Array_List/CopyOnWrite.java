package collections.Array_List;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrite {
    public static void main(String[]args){
        CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<>();
        Iterator itr=list.iterator();
        list.add("megha");
        System.out.println("list contains:");
        while(itr.hasNext())
            System.out.println(itr.next()); itr = list.iterator();
            System.out.println("List contains:");
            while (itr.hasNext())
                System.out.println(itr.next());

        }

    }

