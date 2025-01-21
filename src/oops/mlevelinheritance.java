package oops;

class Addition {
    public void add(int a,int b)
    {
        System.out.println("Addition is" + (a+b));
    }
}
class Subtraction extends Addition
{
    public void sub(int a, int b)
    {
        System.out.println("subtraction is "+(a-b));
    }
}

class Multiplication extends Subtraction {
    public void Multiply(int a, int b) {
        System.out.println("multiplication is " + (a * b));
    }
}
    
class Div extends Multiplication {
        public void division(int a, int b) {
            System.out.println("division is " + (a/b));
        }
        public void CallAllMethods()
        {
             add(3,2);
            sub(2,7);
            Multiply(3,2);
            division(2,3);
    }
}

class calculation extends Div{
    public static void main (String args[])
    {
        Div d = new Div();
        d.CallAllMethods();
    }
}