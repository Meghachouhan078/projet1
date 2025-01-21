package collections.Set_Interface;

import java.util.EnumSet;
import java.util.Iterator;

public class iterateEnum {
    enum game{HOCKEY,CRICKET,TENNIS}
    public static void main(String[] args)
    {
        EnumSet<game> games1= EnumSet.allOf(game.class);
        Iterator<game> iterator= games1.iterator();
        System.out.print("enumset:");

        while (iterator.hasNext()) {
            System.out.print(iterator.next());

            System.out.print(" ,");
        }
    }
}
