package Conditional_StatementsAndScanner;
import java.util.Scanner;
public class ageeinput {
    public static void main(String[]args){
        int age;
        System.out.print("enter your age");
        Scanner r=new Scanner(System.in);
        age=r.nextInt();
        if(age>=18)
        {
            System.out.println("eligible for vote");
        }
        else
        {
            System.out.println("not eligible for vote");
        }
    }
}
