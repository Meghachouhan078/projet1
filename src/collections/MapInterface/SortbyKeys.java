package collections.MapInterface;

import java.util.*;

public class SortbyKeys {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Charlie", 35);
        map.put("Alice", 30);
        map.put("Bob", 25);

        // Sort by Keys using TreeMap
        System.out.println("Sorting by Keys:");
        TreeMap<String, Integer> sortedByKey = new TreeMap<>(map);
        sortedByKey.forEach((key, value) ->
                System.out.println("Key: " + key + ", Value: " + value));

//        // Sort by Values using List and LinkedHashMap
//        System.out.println("\nSorting by Values:");
//        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
//        entryList.sort(Map.Entry.comparingByValue());
//
//          LinkedHashMap<String, Integer> sortedByValue = new LinkedHashMap<>();
//          for (Map.Entry<String, Integer> entry : entryList) {
//             sortedByValue.put(entry.getKey(), entry.getValue());
//         }
//         sortedByValue.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

    }
}