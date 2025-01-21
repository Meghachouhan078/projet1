package collections.MapInterface;

import java.util.*;

public class mapIntegerstringList {
    public static void main(String[] args) {

        Map<Integer, List<String>> map = new HashMap<>();

        map.put(1, Arrays.asList("Apple", "Banana", "Cherry"));
        map.put(2, Arrays.asList("Dog", "Cat", "Horse"));
        map.put(3, Arrays.asList("Red", "Blue", "Green"));

       /*for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            Integer key = entry.getKey();
            List<String> value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        System.out.println("Values for key 2: " + map.get(2));

        map.put(4, new ArrayList<>());
        map.get(4).add("NewValue1");
        map.get(4).add("NewValue2");
        System.out.println("Updated Map: " + map);
    }


}*/
        System.out.println(map);

    }}