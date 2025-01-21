package oops;

public class interff{
    interface yes{
        void show();
    }
}
class testing implements interff.yes{
     public void show(){
        System.out.println("system");
    }
}
class Aa{
    public static void main(String[]args){
        interff.yes obj;
        testing t = new testing();
        obj = t;
        obj.show();
    }
}