//package StringProgram;

public final class Immutable {
    final String pancardNumber;
    public Immutable(String pancardNumber)
    {
        this.pancardNumber=pancardNumber;
    }
     public String getpancardNumber(){
        return pancardNumber;
     }
}
public  void main(String[]args){
    Immutable I=new Immutable("abcd");
            String s1= I.getpancardNumber();
            System.out.println("pancardnumber is:"+ s1);
}


