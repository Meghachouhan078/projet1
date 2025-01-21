package Conditional_StatementsAndScanner;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int a, b;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first numbers:");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
         System.out.println("Enter second number");
        b = r.nextInt();
        System.out.println("enter the operator:(+,-,*,/)");
        char op = sc.next().charAt(0);
        double o = 0;

        int result=0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Invalid choice");
        }
                System.out.println("result is:" + result);
        }
    }


