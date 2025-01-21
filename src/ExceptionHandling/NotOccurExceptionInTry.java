package ExceptionHandling;

public class NotOccurExceptionInTry {
    public static void main (String[] args)
    {
        try
        {
            String str = "123";

            int num = Integer.parseInt(str);
            System.out.println("Inside try block");

        }
        catch(NumberFormatException ex)
        {
            System.out.println("catch block executed...");
        }

        System.out.println("Outside try-catch clause");
    }
}

