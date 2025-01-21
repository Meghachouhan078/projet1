package collections.MapInterface;
import java.util.HashMap;
public class retriveusingkey {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");

        System.out.println("HashMap contents:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Retrieve a value using a key'
        int searchKey = 3;
        if (map.containsKey(searchKey)) {
            System.out.println("Value for key " + searchKey + ": " + map.get(searchKey));
        } else {
            System.out.println("Key " + searchKey + " not found in the HashMap.");
        }

        // Example of updating a value
        map.put(3, "Coconut");
        System.out.println("Updated value for key 3: " + map.get(3));

        // Remove a key-value pair
        map.remove(4);
        System.out.println("HashMap after removing key 4:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
