package arraysprogram;

public class negativepositive {
    public static void main(String[] args) {
        int arr[] = {-2, 3, -4, 5, -6, 7, -8, 9};
        int n = arr.length;
        printorder(arr, n);
    }

    public static void printorder(int arr[], int n) {
        int temp;
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n / 2; j++)

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;

                    }
                }
            for (int j = n / 2; j < n - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }


            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
