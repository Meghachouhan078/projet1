package oops;


abstract class Sunstar {
    abstract void printInfo();
}

class Employeee extends Sunstar {
    void printInfo()
    {
        String name = "avinash";
        int age = 21;
        float salary = 222.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

class Base {
    public static void main(String args[])
    {
        Sunstar s = new Employeee();
        s.printInfo();
    }
}