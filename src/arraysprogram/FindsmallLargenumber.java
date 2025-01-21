package arraysprogram;

class FindsmallLargestnumber{
    public static void main(String[]args){
        int[] arr= new int[]{-2,2,6,5,9,7};
        int largest=arr[0];
        int smallest=arr[0];

        for(int i=1; i<arr.length;i++) {
            if (arr[i] > largest)
                largest = arr[i];
            else if (arr[i] < smallest);

        }
            System.out.println("largest no is"+ largest);
        System.out.println("smallest no is"+ smallest);


            }
        }
