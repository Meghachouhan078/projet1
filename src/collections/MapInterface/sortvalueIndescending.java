package collections.MapInterface;

import java.util.*;

public class sortvalueIndescending {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 3);
        hashMap.put("Orange", 5);
        hashMap.put("Banana", 2);
        hashMap.put("Grapes", 4);

        System.out.println("Original HashMap: " + hashMap);

        // Sort the HashMap by values in descending order
        List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());
        //use custom comparator
        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Sorted Map by Values (Descending): " + sortedMap);
    }
}
