package collections.Array_List;

import java.util.LinkedList;
import java.util.AbstractSequentialList;

public class AbstractSequentialListt {
    public static void main(String[]args){
        AbstractSequentialList<Integer> as=new LinkedList<>();

        as.add(5);
        as.add(6);
        as.add(7);
        System.out.println(as);
    }
}
