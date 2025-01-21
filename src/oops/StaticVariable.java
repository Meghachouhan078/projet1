package oops;

   public class StaticVariable {
       static int x = 10;

       public static void main(String[] args) {
           StaticVariable a = new StaticVariable();
           StaticVariable a1 = new StaticVariable();

           System.out.println(a.x);
          // System.out.println(a1.x);
       }
   }