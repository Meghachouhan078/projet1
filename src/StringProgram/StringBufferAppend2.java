package StringProgram;

public class StringBufferAppend2 {
    public static void main (String[]args){
        StringBuffer s=new StringBuffer();

        s.append("hello");
        s.append(" ");
        s.append("java");
        String str=s.toString();
        System.out.println(str);
    }
}
