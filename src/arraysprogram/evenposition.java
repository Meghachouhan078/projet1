package arraysprogram;

public class evenposition {

        public static void main(String[] args) {

            int [] arr = new int[] {2, 2, 3, 7, 5,6};
            System.out.println("Elements of given array present on even position: ");

            for (int i = 1; i < arr.length; i = i + 2)
            {
                System.out.println(arr[i]);
            }
        }
    }
