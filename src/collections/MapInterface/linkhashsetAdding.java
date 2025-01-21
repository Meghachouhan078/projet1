package collections.MapInterface;

import java.util.LinkedHashMap;

public class linkhashsetAdding {
    public static void main(String args[]) {

        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

        lhm.put(3, "Geeks");
        lhm.put(2, "For");
        lhm.put(1, "Geeks");

        System.out.println(lhm + "");

    }
}
