package collections.MapInterface;

import java.util.HashMap;

public class changeInHashMap {
    public static void main(String args[])
    {
        HashMap<Integer, String> hm = new HashMap<Integer,String>();

        hm.put(1, "the ");
        hm.put(2, "for");
        hm.put(3, "chouhan");

        System.out.println("Initial Map " + hm);

        hm.put(2, "megha");

        System.out.println("Updated Map " + hm);
    }
}
