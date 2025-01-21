package oops;

interface multipleInterface  {
    default void show(){
        System.out.println("default interface");
    }
}
interface inter1 extends multipleInterface{
    void display();
}
interface inter2 extends multipleInterface{
    void print();
}
class Testclass implements inter1,inter2 {
    public void display() {
        System.out.println("Display from Interface1");
    }

    public void print() {
        System.out.println("Print from Interface2");
    }

    public static void main(String[] args) {

        Testclass t = new Testclass();
        t.show();
        t.display();
        t.print();
    }
}