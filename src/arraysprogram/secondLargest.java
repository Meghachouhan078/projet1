package arraysprogram;

public class secondLargest {
    public static void main(String[]args){
        int[]arr={2,4,12,15,13};
        int n=arr.length;
        int largest=IsLargest(arr,n);
        System.out.println("second largest number is"+largest);
    }
    public static int IsLargest(int arr[],int n) {
        int Largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > Largest) {
                SecondLargest=Largest;
                Largest = arr[i];

            } else if (arr[i] > SecondLargest)
                SecondLargest= arr[i];
        }
        return SecondLargest;
    }
}
