package collections.Set_Interface;

import java.util.EnumSet;

public class Enu {
    enum Game{cricket,tennis,football}
    public static void main(String[]args){
        EnumSet <Game> games= EnumSet.allOf(Game.class);
        System.out.println("EnumSet: " + games);
    }
}
