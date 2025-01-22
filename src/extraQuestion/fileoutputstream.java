package extraQuestion;

import java.io.FileOutputStream;
import java.io.IOException;

public class fileoutputstream {
    public static void main(String[]args) throws IOException
    {
       int i;
        FileOutputStream fo=new FileOutputStream("file.txt");
        //transfer this string into file
        String s="megha";
        char[]ch= s.toCharArray();
                for( i=0;i<s.length(); i++){
                    fo.write(ch[i]);
                }
                fo.close();
    }
}
