package StringProgram;

public class StrinBufferAppend {
    public static void main(String[]args){
        StringBuffer sb=new StringBuffer("hello");
        sb.append("java");
        System.out.println(sb);

        sb.insert(1,"Java");
        System.out.println(sb);

        sb.replace(1,3,"megha");
        System.out.println(sb);

        sb.delete(1,3);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println (sb.capacity());
        sb.append("my name is megha");
        System.out.println(sb.capacity());

        int p= sb.length();
        System.out.println("lenghth is:" +p);

    }
}
