package arraysprogram;

public class arraypalindrome {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 2, 4};
        int[] array2 = {1, 2, 3, 2, 4,};

        boolean result = ArraysPalindromeEqual(array1, array2);

        if (result) {
            System.out.println("The arrays are palindrome-equal.");
        } else {
            System.out.println("The arrays are not palindrome-equal.");
        }
    }

    public static boolean ArraysPalindromeEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

       for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[array2.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}


