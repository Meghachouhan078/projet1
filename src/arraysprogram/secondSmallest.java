package arraysprogram;

public class secondSmallest {
    public static void main(String args[]) {

        int arr[] = {12, 13, 1, 89, 67, 82};
        int n = arr.length;
        int smallest = secSmallest(arr, n);
        System.out.print("second smallest is:" + smallest);
    }

    static int secSmallest(int arr[], int n) {
        int first = Integer.MAX_VALUE,
                second = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < first) {
                second=first;
                first = arr[i];
            } else if (second > arr[i])
                second = arr[i];
        }
            return second;

        }
    }
