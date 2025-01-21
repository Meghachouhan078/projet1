package StringProgram;

public class cocatusingstringbuilder {
    public static void main(String[]args){
      StringBuilder s1=new StringBuilder("java");
        StringBuilder s2 = new StringBuilder("hello");
        StringBuilder s=s1.append(s2);
        System.out.println(s);



        String s3 = new String("Hello");
        String s4 = new String(" World");
        String s5 = String.format("%s%s",s3,s4);
        System.out.println(s.toString());
    }

}
