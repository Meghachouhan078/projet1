package StringProgram;

public class SubstringOfString {
    public static void main(String[]args){
        String str="abbc";
        System.out.println("substring of string are:");
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                System.out.println(str.substring(i,j));
            }

        }
    }

}

