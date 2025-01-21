package oops;

abstract class Bike{
    //void print(){
       // System.out.println("the");
   // }
    abstract void run();
}
class Honda extends Bike{
    void run(){

        System.out.println("running safely");
    }
    public static void main(String args[]){
        Bike obj = new Honda();
        obj.run();
        //obj.print();
    }
}
