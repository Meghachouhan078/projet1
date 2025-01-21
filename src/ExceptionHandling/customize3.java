package ExceptionHandling;

public class customize3 extends Exception
{
    customize3(){
        super("you are under age");
    }
    customize3(String message){
        super(message);
    }
}
class voting{
    public static void main(String[]args){

        int age = 17;
        try {
            if (age < 18)
            {
                throw new customize3("not eligible for vote");
            } else {
                System.out.println("eligible for vote");
            }
            }catch(customize3 e) {
            System.out.println("caught");
           e.printStackTrace();

        }
    }
}