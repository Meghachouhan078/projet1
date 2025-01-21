package oops;

    public class A{
        void bark() {
            System.out.println("class a");
        }

    }
    class B extends A
    {
        void add(){
            System.out.println("class b");

    }
    class c extends B{
        void eat(){
            System.out.println("class c");
        }

    }
    public static void main(String[] args){
        B b=new B();
        b.add();
        b.bark();
    }
}
