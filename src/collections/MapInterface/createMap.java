package collections.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class createMap {
    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("m",1);
        map.put("n",1);
        System.out.println("Map elements: " + map);
    }
}

