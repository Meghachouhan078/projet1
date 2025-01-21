package collections.MapInterface;

import java.util.SortedMap;
import java.util.TreeMap;

public class sortedmap {
    public static void main(String[] args) {
        SortedMap<String, Integer> sortedMap = new TreeMap<>();

        sortedMap.put("A", 1);
        sortedMap.put("C", 3);
        sortedMap.put("B", 2);

        int valueA = sortedMap.get("A");
        System.out.println("Value of A: " + valueA);

        sortedMap.remove("B");

        for (String key : sortedMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + sortedMap.get(key));
        }
    }
}
