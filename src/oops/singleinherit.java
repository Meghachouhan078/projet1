package oops;

 class Animal {
    void eat()
    {

        System.out.println("eating");
    }

     public void Sound() {
     }
 }

    class Dog extends Animal {
//        void bark()
//        {
//            System.out.println("barking");
//        }

    }


    class c extends Dog {
        public static void main(String args[]) {
             Animal d = new Dog();
            d.eat();

        }
    }


