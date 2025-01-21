package ExceptionHandling;

public class chainedException {
    static void demo(){
        NullPointerException e=new NullPointerException("top layer");
        //add a cause
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }
    public static void main(String[]args){
        try{
            demo();
        }catch(NullPointerException e)
        {
            System.out.println("caught" +e);
            System.out.println("original cause"+e.getCause());
        }
    }
}
