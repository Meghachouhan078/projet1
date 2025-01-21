package ExceptionHandling;

public class ArithmeticExceptionn {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;
        try {
            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}

