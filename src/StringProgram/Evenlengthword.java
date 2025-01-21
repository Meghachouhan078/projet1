package StringProgram;

import java.util.Scanner;

public class Evenlengthword {
    public static void main(String[] args) {
        String input = "my name is megha chouhan";
        String[] words = input.split("\\s+");

        System.out.println("words with even length");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 == 0)
                System.out.println(words[i]);
        }
    }
}


//import java.util.Scanner;
class evenlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String input = sc.nextLine();
        String[] words = input.split("\\s+");
        System.out.println("words with even length");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 == 0)
                System.out.println(words[i]);

        }
    }
}