package collections.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class hashmapiterator {
    public static void main(String[]args) {

        HashMap<String, String> hashmap = new HashMap<String, String>();
        hashmap.put("Key1", "Value1");
        hashmap.put("Key2", "Value2");
        System.out.println("after iterate");
        for (Map.Entry<String, String> entry : hashmap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }}