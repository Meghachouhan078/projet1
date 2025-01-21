package arraysprogram;

import java.util.Arrays;

public class negaposi {
    public static void main(String[] args) {
        int[] array = {2, 9, -5, 4, -3, 6, -2, 8, -7, 48};
        Arrays.sort(array);

        System.out.println("Rearranged Array :");
        for(int i=0;i<array.length;i++) {
          System.out.print(array[i]) ;
        }

       // for (int num : array) {
           // System.out.print(num + " ");
       // }
        System.out.println();
    }
}


