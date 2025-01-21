package StringProgram;

public class RotateString {
    public static void main (String[]args){
        System.out.println("java2blog and blogjava2 are rotation of each other:" + isRotation("java2blog","blogjava2"));
    }
        public static boolean isRotation(String str,String rotation){
            String str2=str+str;
            if(str2.contains(rotation)){
               return true;
            }

            return false;
            }
}

