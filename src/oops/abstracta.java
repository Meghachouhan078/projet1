package oops;

abstract class animal
 {
    public abstract void sound();
 }

class Dogg extends animal
{
    public void sound()
    {
        System.out.println("Dog is barking");
    }
}
class Lion extends animal
         {
             public void sound()
 {
     System.out.println("lion is roar");
 }
}
class Test
{
    public static void main(String[] args)
    {
        Dog d=new Dog();
        Lion l=new Lion();
        d.Sound();
        l.sound();
    }
}
