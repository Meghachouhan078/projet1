package oops;

 abstract class car {
    abstract void start();
}
class vehicle extends car{
    void start(){
        System.out.println("the system");
    }
}
class base
{
    public static void main(String[]args){
        vehicle v= new vehicle();
        v.start();
    }
}
