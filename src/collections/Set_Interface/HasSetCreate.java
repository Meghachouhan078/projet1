package collections.Set_Interface;

import java.util.HashSet;

public class HasSetCreate
{
    public static void main(String[] args)
    {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(1);

        System.out.println("HashSet Size: " + hs.size());
        System.out.println("Elements in HashSet: " + hs);
    }
}

