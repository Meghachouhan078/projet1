package oops;

public interface In1 {
    final int a=10;
    void print();
}
class Testclasss implements In1{

    public void print(){
        System.out.println("evision");
    }
}
class T{
public static void main(String[]args){
    Testclasss tc= new Testclasss();
    tc.print();
    System.out.println(tc.a);
}}