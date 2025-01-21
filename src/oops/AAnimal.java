package oops;

public class AAnimal {
   public  void makeSound()

    {
        System.out.println(" animal sounding");
    }
}
  class cat extends Animal {
     public void makeSound()

     {
         System.out.println(" cat sounding");
     }
 }
class test {
    public static void main(String[] args) {
        AAnimal a=new AAnimal();
        a.makeSound();
        cat c = new cat();
        c.makeSound();
    }
}
