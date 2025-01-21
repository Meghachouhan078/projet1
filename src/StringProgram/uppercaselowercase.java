package StringProgram;//package StringProgram;
import java.util.Scanner;

public class uppercaselowercase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String formattedString = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (i % 2 == 0) {
                formattedString += Character.toUpperCase(c);
            } else {
                formattedString += Character.toLowerCase(c);
            }
        }

        System.out.println("Formatted String: " + formattedString);
    }
}
