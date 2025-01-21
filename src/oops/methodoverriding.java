package oops;

 class parent {
     void print ()
     {
         System.out.println("parent class");

     }
}
class subclass1 extends parent {
    void print() {
        System.out.println("subclass1");
    }
}
    class subclass2 extends parent {
        void print() {
            System.out.println("subclass2");
        }
    }

    class Gfg {
        public static void main(String[] args) {
            parent a;
            a = new subclass1();
            a.print();
            a = new subclass2();
            a.print();

        }
    }

