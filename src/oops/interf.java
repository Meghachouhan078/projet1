package oops;

public interface interf {
    final int a =10;
    void display();

}
class testclass implements interf{
    public void display() {
        System.out.println("megha");
    }

public static void main(String[]args)
{
    testclass t1=new testclass();
    t1.display();
    System.out.println(t1.a);
}
}