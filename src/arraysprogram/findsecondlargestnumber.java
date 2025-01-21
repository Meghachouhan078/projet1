package arraysprogram;

import java.util.Arrays;

public class findsecondlargestnumber {
    public static void main(String[] args) {
        int[] arr = {45, 53, 22, 89, 77, 98, 94};
        int result = findSecondLargest(arr);
        System.out.println("The second largest number is: " + result);
    }

public static int findSecondLargest(int[] array) {
    for (int i = array.length - 2; i >= 0; i--) {
        if (array[i] != array.length - 1) {
            return array[i];
        }
    }
    return -1;
}}


