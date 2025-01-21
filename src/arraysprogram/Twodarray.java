package arraysprogram;

public class Twodarray {
    public static void main(String[] args) {
        int arr[][] = {{2, 5, 4}, {1, 5, 3}, {7, 8, 9}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }
    }

}