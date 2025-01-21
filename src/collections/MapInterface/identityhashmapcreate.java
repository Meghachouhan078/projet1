package collections.MapInterface;

import java.util.IdentityHashMap;

public class identityhashmapcreate {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put("A", 1);
        identityHashMap.put(new String("A"), 2);
        System.out.println(identityHashMap.size()); // 2
        System.out.println(identityHashMap.get("A")); // 1
    }
}
