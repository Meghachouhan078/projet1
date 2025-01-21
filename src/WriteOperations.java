import java.io.FileWriter;
import java.io.IO;
import java.io.IOException;

public class WriteOperations {
    public static void main(String[]args){
        try{
            FileWriter fw=new FileWriter("file.write");
            fw.write("hello, i m megha ");
            fw.close();
            System.out.println(("the victory"));
        }catch (IOException e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
