package collections.MapInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class sortkey {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 3);
        hashMap.put("Orange", 5);
        hashMap.put("Banana", 2);
        hashMap.put("Grapes", 4);

        System.out.println("Original HashMap: " + hashMap);


        TreeMap<String, Integer> sortedMap = new TreeMap<>(hashMap);

        System.out.println("Sorted Map by Keys: " + sortedMap);

        // If you need the sorted map in a LinkedHashMap to maintain insertion order
       // LinkedHashMap<String, Integer> sortedLinkedHashMap = new LinkedHashMap<>();
      //  for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
         //   sortedLinkedHashMap.put(entry.getKey(), entry.getValue());
       // }

       // System.out.println("Sorted LinkedHashMap by Keys: " + sortedLinkedHashMap);
    }
}

