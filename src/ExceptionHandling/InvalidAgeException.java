package ExceptionHandling;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String str)
    {
        super(str);
    }
}
 class TestCustomException1 {
     static void validate(int age) throws InvalidAgeException {
         if (age < 18) {
             throw new InvalidAgeException("not valid for vote");
         } else {
             System.out.println("can give vote");
         }
     }

     public static void main(String[] args) {
         try {
             validate(10);
         } catch (InvalidAgeException e) {
            System.out.println("Caught the exception");
             System.out.println(" exception occured" + e);
            // e.printStackTrace();
         }
         System.out.println("rest of code");
     }
 }


