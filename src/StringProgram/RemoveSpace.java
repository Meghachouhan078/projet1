package StringProgram;

public class RemoveSpace {
    public static void main(String[]args){
        String s="my name is megha";
        System.out.println(s);
        String a[]=s.split(" ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}
