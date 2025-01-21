package ExceptionHandling;

import java.io.IOException;

public class propogationInchecked {
    void m() throws IOException {
        throw new IOException("device error");
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        }catch(Exception e){
            System.out.println("exception handled");
        }
    }
    public static void main(String[]args){
        propogationInchecked obj=new  propogationInchecked();
                obj.p();
        System.out.println("normal flow");
    }

}