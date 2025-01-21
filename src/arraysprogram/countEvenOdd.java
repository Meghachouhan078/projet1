package arraysprogram;
 class ArrayTest {

    public static void main(String[] args) {
        int arr[]={1,2,3 ,4,7,8,9};
        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 == 0) {
                ++evenCount;
            } else
                ++oddCount;
        }

        System.out.println("Count of the Even numbers = " + evenCount);
        System.out.println("Count of the Odd numbers = " + oddCount);

    }

}