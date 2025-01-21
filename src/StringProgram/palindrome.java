package StringProgram;

public class palindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        return s.equals(rev);
    }

    public static void main(String[] args) {

        String s = "level";
        boolean result = isPalindrome(s);

        if (result) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("string is not a palindrome.");
        }
    }
}

