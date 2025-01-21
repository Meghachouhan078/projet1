package oops;

public class newInst {
    String s="hello";
    public static void main (String[]args){
        try
        {
            newInst I= newInst.class.newInstance();
           System.out.println(I.s);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
