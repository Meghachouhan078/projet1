package collections.MapInterface;

import java.util.EnumMap;

enum Days {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday,Sunday
}
public class enumMap {
    public static void main(String[] args) {
        EnumMap<Days, String> s=new EnumMap<>(Days.class);

        s.put(Days.Monday,"work");
        s.put(Days.Tuesday,"work");
        s.put(Days.Wednesday,"Study");
        s.put(Days.Friday,"relax");
        s.put(Days.Saturday,"megha");
        System.out.println(s.get(Days.Monday));
        System.out.println(s.get(Days.Tuesday));


    }
}

