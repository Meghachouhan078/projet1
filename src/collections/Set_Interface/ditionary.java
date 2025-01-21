package collections.Set_Interface;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class ditionary {
    public static void main(String[] args) {
        Dictionary<String, Integer> d = new Hashtable<>();

        d.put("A", 25);
        d.put("B", 30);
        d.put("C", 35);

        System.out.println("Value of B: " + d.get("B"));

        int oldValue = d.put("C", 40);
        System.out.println("Old Value of C: " + oldValue);
        d.remove("A");

        Enumeration<String> k = d.keys();
        while (k.hasMoreElements()) {
            String key = k.nextElement();
            System.out.println("Key: " + key + ", Value: " + d.get(key));
        }
    }
}
