package ExceptionHandling;

public class finallyy {
    public static void main(String[] args) {
        int a = 8, b = 5, c = 5, result;

        try {
            result = a / (b - c);
        } catch (ArithmeticException e) {
             System.out.println(" Exception caught division by zero");
        } finally {
            System.out.println("i m in final block");
        }
    }
}

