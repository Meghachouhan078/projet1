package oops;
interface printable {

   // default void display(){
      //  System.out.println("the");
  //  }
    void print();

}
class A6 implements printable{
    public void print()
    {
        System.out.println("Hello");
    }
    public static void main(String args[]){
        A6 obj = new A6();
        obj.print();
       // obj.display();
    }
}