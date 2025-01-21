package StringProgram;

public class ReverseString {
    public static void main(String[]args){
        String Str="evision";
        String reverse="";
        for(int i =Str.length()-1; i>=0;i--){
            reverse=reverse +Str.charAt(i);
        }
        System.out.println("reverse of String is:" +reverse);
    }
}
