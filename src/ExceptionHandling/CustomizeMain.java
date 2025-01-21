package ExceptionHandling;

public class CustomizeMain extends Exception{
    public CustomizeMain(String s)
    {
        super(s);
    }
}
 class A {
     public static void main(String[] args) {
         try {
             throw new CustomizeMain("megha");
         } catch (CustomizeMain cm) {
             System.out.println("custom caught");
             System.out.println(cm.getMessage());

         }
     }
 }

