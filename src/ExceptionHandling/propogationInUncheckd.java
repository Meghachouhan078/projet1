package ExceptionHandling;

public class propogationInUncheckd {
    void m(){
        int data=50/0;
    }
    void n(){
        m();
    }
    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String[]args)
    {
        propogationInUncheckd  obj=new propogationInUncheckd();
        obj.p();
        System.out.println("mormal flow");

    }
}

