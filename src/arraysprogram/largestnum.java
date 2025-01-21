package arraysprogram;

public class largestnum {
    public static void main(String[]args){
        int[] arr= new int[]{2,2,6,5,9,7};
        int largest=arr[0];

        for(int i=1; i<arr.length;i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        System.out.println("largest no is"+ largest);

    }
}

