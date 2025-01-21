package arraysprogram;

public class serchelement {
    static int llinearsearch(int[]arr, int x){
      for( int i=0;i<arr.length;i++) {
          if(arr[i]==x)
              return i;
          }
          return -1;
      }
      public static void main(String[] args){
          int arr[]= {33,45,23,5,6,7,8};
           int x = 6;
         int index=llinearsearch(arr,x);

          if(index==-1){

                System.out.println("element not found");}
            else
           {
               System.out.println("Element found at position " + index);
           }
      }
}
