package StringProgram;

public class RemoveFirstAndLast {
    public static void main(String[]args){
        String str="vijay";;
        System.out.println(removeletter(str));
    }

    public static String removeletter(String str){
        str=str.substring(1,str.length()-1);
        return str;

    }

}

