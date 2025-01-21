package ExceptionHandling;

  class MyCustomException extends Exception
{

}
    class TestCustomException2
{
    public static void main(String args[])
    {
        try
        {
            // throw an object of user defined exception
            throw new MyCustomException();
        }
        catch (MyCustomException ex)
        {
            System.out.println("Caught the exception");
        }

        System.out.println("rest of the code...");
    }
}
