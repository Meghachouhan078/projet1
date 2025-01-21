package extraQuestion;

public class SeriesOfPrimeNumber {
    public static void main(String[]args){
        System.out.println("prime number are 1 to 10:");
        for( int n=2;n<=10;n++){
          //                                                                                        SeriesOfPrimeNumber p=new SeriesOfPrimeNumber();
            if(isPrime(n)){
                System.out.println(n);
            }
        }
    }
    public static boolean isPrime(int n){
        if (n <= 1) {
           return false;
        }
        for (int i = 2; i <=n; i++) {
            if (n% i == 0) {
                return false;
            }
        }
        return true;
    }
}


