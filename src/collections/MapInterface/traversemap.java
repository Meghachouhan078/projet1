package collections.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class traversemap {
        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();

            map.put("vishal", 10);
            map.put("sachin", 30);
            map.put("vaibhav", 20);

            for (Map.Entry<String, Integer> e : map.entrySet())
                System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
        }
    }

  /*      for (Entry<String, String> entry : keyValueSet)
        {
        System.out.println(entry.getKey()+" : "+entry.getValue());
        }


Set<Integer> keySet = map.keySet();

        for (Integer key : keySet)
        {
        System.out.println(key);
        }

        for(String key:e.keyset()){
        System.out.println("key"+ key+","value:"+e.get(key));

*/
