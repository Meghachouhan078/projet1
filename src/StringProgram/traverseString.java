package StringProgram;

public class traverseString {
    public static void main(String[]args){
        String str="megha";
        traverseString(str);
    }
    public static void traverseString(String str){
      for(int i=0; i<str.length(); i++){
          System.out.print(str.charAt(i)+ " ");
      }
    }

}
