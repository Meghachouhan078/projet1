package collections.Array_List;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
    public static void main(String[]args){
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        Set<Integer> set=new HashSet<>();

        for(Integer i:list){
            set.add(i);

        }
        System.out.println(set);
    }
}
