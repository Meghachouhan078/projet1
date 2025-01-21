package oops;

public class polyAnimal {
    public void sound() {
        System.out.println(" animal make sound");
    }
}
     class Bird extends polyAnimal {
        public void sound() {
            System.out.println("bird can sound");
        }
    }

    class Cat extends polyAnimal {
        public void sound() {
            System.out.println("cat can sound");
        }
    }

class testt{
    public static void main(String[]args){
       polyAnimal animal = new polyAnimal();
        Bird bird=new Bird();
        Cat cat=new Cat();
        animal.sound();
        bird.sound();
        cat.sound();

    }
}
