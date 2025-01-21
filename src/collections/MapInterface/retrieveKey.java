package collections.MapInterface;

import java.util.HashMap;

public class retrieveKey {
    public static void main(String[]args){
        HashMap<String,Integer> hmm=new HashMap<>();
        hmm.put("one",1);
        hmm.put("two",2);
        hmm.put("three",3);
        hmm.put("four",4);
        System.out.println(hmm);

       int value=hmm.get("three") ;
        System.out.println(value);
    }
}
