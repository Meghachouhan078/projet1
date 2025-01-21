package arraysprogram;

public class AverageOFarray {
    public static void main(String[]args){
        int[] arr =new int[] {1,2,3,4,5};
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum = sum + arr[i];
        }
            double average=sum/arr.length;
            System.out.println("Average value of the array elements is : " + average);

        }
    }


