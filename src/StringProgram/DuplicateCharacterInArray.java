package StringProgram;

public class DuplicateCharacterInArray {
    public static void main(String[]args){
        String str="programmingoo";
        char[]ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            int count=0;
            if(ch[i]=='0')
                continue;
            for(int j=i+1; j<ch.length;j++){
                if(ch[i]==ch[j] &&count==0){
                    System.out.println(ch[i] + " ");
                    ch[j]='0';
                  count++;

                }
            }
        }
    }
}



