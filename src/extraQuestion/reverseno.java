package extraQuestion;

public class reverseno {
    public static void main(String[]args){
        int n=1231,rev=0,rem;

        while(n!=0){
           rem= n%10;
           rev=rev*10+rem;
           n=n/10;
        }
        System.out.println ("Reversed Number: " + rev);
    }
}
