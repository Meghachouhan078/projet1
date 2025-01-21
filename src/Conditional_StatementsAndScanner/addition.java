package Conditional_StatementsAndScanner;

import java.util.Scanner;

public class addition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System .out .println("enter the first integer");
        int a = sc.nextInt();
        System.out.println("enter the second integer");
        int b= sc.nextInt();
        System.out.println("addition of the number is "+(a+b));
        System.out.println("subtraction of the number is "+(a-b));
        System.out.println("multiplication of the number is "+(a*b));
        System.out.println("division of the number is "+(a/b));
    }
}
