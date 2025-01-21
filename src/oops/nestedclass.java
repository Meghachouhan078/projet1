package oops;

public class nestedclass {

    class  innerclass{
        void display(){
            System.out.println(" inside inner class");
        }
    }
       void print(){
       innerclass ic=new innerclass();
        ic.display();
    }
    public static void main(String[]args){
        nestedclass nc=new nestedclass();
        nc.print();
    }
}
