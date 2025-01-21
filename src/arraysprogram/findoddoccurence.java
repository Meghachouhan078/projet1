package arraysprogram;

public class findoddoccurence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 3};
        int result = findOddOccurrence(arr);
        System.out.println("The number occurring odd number of times is: " + result);
    }

    public static int findOddOccurrence(int[] arr) {
        int result = 0;
        for(int i=0;i<arr.length;i++){

            result ^= arr[i];
        }
        return result;
    }
}
