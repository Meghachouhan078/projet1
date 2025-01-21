package collections.Set_Interface;

import java.util.EnumSet;

public class removeEnum {
    enum Game {CRICKET, HOCKEY, TENNIS}

    public static void main(String[] args) {
        EnumSet<Game> games = EnumSet.allOf(Game.class);
        System.out.println("EnumSet: " + games);
        boolean value = games.remove(Game.CRICKET);
        System.out.println("Is CRICKET removed? " + value);
    }
}