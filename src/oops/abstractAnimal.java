package oops;

abstract class abstractAnimal {
    public abstract void makesound();
}
    class Lionn extends abstractAnimal{
       public void makesound(){
            System.out.println("lion roars");
        }
    }
    class Tiger extends abstractAnimal {

        public void makesound() {
            System.out.println("Tiger growls!");
        }
    }
    class testtt{
        public static void main(String[]args){
            abstractAnimal lion1 = new Lionn();
            lion1.makesound();
            abstractAnimal tiger1 = new Tiger();
            tiger1.makesound();
        }
    }

