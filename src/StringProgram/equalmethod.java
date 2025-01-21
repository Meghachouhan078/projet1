package StringProgram;

public class equalmethod {
    public static void main(String[]args){
        String s1="megha";
        String s2="megha";
        String s3=new String ("megha");
        String s4="vijay";
    // By equals method
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));

    //by == operator
        System.out.println(s1==s2);
    }
}
