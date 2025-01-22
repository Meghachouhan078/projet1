package extraQuestion;

import java.io.FileReader;
import java.io.Reader;

public class IoReadOperations {
    public static void main(String[]args){
        try{
            Reader r =new FileReader("file.txt");

            int data=r.read();
            while(data !=-1){
                System.out.println((char)data);
                data=r.read();
            }
            r.close();
        } catch (Exception e) {
            System.out.println("an error ocurred"+e.getMessage());
        }
    }
}

