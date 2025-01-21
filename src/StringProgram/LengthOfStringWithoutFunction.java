package StringProgram;

public class LengthOfStringWithoutFunction {
    // public class StringLength {
    public static void main(String[] args) {
        String str = "Hello world!";
        int count = 0;
        try {
            for (int i = 0; i < str.charAt(i); i++) {
                count++;
            }
        }catch(StringIndexOutOfBoundsException e){
        }

            System.out.println("Length of the string is: " + count);

    }

}



  /*  public class StringLengthWithoutLengthMethod {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int length = 0;

        // Convert string to character array
        char[] charArray = str.toCharArray();

        // Iterate through the character array to find the length
        for (char c : charArray) {
            length++;
        }

        System.out.println("The length of the string is: " + length);
    }
}*/
