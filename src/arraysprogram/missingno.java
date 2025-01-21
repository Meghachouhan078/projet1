package arraysprogram;

public class missingno {
    public static void main(String[] args) {

        int[] arr={7,5,6,1,4,2};
       int result=missingNumber(arr);
        System.out.println("Missing number from array :" +result);

    }
    public static int missingNumber(int[] arr)
    {
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int restSum=0;
        for (int i = 0; i < arr.length; i++) {
            restSum=restSum+arr[i];
        }
        int missingNumber=sum-restSum;
        return missingNumber;
    }
}
