package arraysprogram;


class minimuvalue {
    public static void main(String[] args) {
        int arr[] = {3, 2, 44, 5,};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}

