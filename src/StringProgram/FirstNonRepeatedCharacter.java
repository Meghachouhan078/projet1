package StringProgram;

public class FirstNonRepeatedCharacter {
    public static char findFirstNonRepeatedCharacter(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            int count = 0;

            for (int j = 0; j < length; j++) {
                if (currentChar == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                return currentChar;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstNonRepeatedCharacter(input);

        if (result != '\0') {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}