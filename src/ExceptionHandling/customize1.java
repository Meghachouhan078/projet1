package ExceptionHandling;

public class customize1 extends Exception {
}
 class setText{
    public static void main(String[]args){
        try{
            throw new customize1();

        }catch(customize1 c){
            System.out.println("caught");
            System.out.println(c.getMessage());
        }
    }
}
