package arraysprogram;

 class pairsOfNumber {
    public static void main(String[]args){
        int[] arr={2,4,6,8,10};

        int total= pairsOfNumber(arr);
        System.out.println("total pairsofNumber:" + total);

    }

public static int pairsOfNumber(int[] arr) {
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            System.out.println(arr[i] + " " + arr[j]);
            total++;
        }
        System.out.println();
    }
        return total;
    }
}
