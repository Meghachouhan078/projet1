package arraysprogram;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int arr[] = { 10, 30, 40, 20, 10, 30, 65, 74, 65, 20, 50, 10 };
        int n = arr.length;
        duplicateElement(arr, n);
    }
    public static void duplicateElement(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j] ) {
                    arr[j] = 0;
                }
            }

            if(arr[i]!=arr[0]){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

}
//&& arr[i] != 0
