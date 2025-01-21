package collections.MapInterface;

import java.util.*;

public class sortbyvalue {
    public static void main(String[] args) {
        // Create a HashMap and populate it with some data
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 3);
        hashMap.put("Orange", 5);
        hashMap.put("Banana", 2);
        hashMap.put("Grapes", 4);

        System.out.println("Original HashMap: " + hashMap);


        List<Map.Entry<String,Integer>> list = new ArrayList<>(hashMap.entrySet());
        list.sort(Map.Entry.comparingByValue());

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
          sortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println("Sorted Map by Values: " + sortedMap);
    }

    }

    // Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
   // @Override
   // public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
   //  return e2.getValue().compareTo(e1.getValue()); // Descending order
   // }
  // });
