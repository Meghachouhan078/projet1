package extraQuestion;

//public class primeNo {
   /* public static void main(String[]args){
        for(int i=1;i<=10;i++){
            {
                int flag=0;
                for(int j=2;j<=i;i++) {
                    if (i % j == 0) {
                        flag = 1;
                    }
                }
                    if(flag==2){
                        System.out.println(i);
                    }
                    }
                }
            }
        }*/

import java.util.Scanner;

/*boolean show(int n){
boolean c =true;
for(int i=2;i<n;i++){
    if(n%i==0){
        c=false;
    }
}
return c;
}
}
 class Prime{
    public static void main(String[]args){
        for(int n=2;n<10;n++){
            primeNo p=new prime();
            if(p.Show(n)){
                System.out.println(n);
            }
        }
    }

}*/


class Prime
{
    public static void main(String arg[])
    {
        int i,count;
        System.out.print("Enter n value : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Prime numbers between 1 to "+n+" are ");
        for(int j=2;j<=n;j++)
        {
            count=0;
            for(i=1;i<=j;i++)
            {
                if(j%i==0)
                {
                    count++;
                }
            }
            if(count==2)
                System.out.print(j+"  ");
        }
    }
}