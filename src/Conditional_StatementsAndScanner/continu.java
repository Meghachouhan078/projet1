package Conditional_StatementsAndScanner;

 class test{

    public static void main(String[] args)
    {
        for (int i = 0; i <= 15; i++) {

            if (i == 10 || i == 12) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}