/*package ExceptionHandling;
import java.io.*;
public class FileNotFound {
public static void main(String[]args){
    FileReader fs=new FileReader("Test.txt");
    BufferedReader bf=new BufferedReader(fs);
    String filedata=null;

    while(filedata=bf.readLine()) != null)
    {
        System.out.println(filedata);
    }
    try{
        bf.close();
    }catch(IOException e){
        e.printStackTrace();
    }
}  }*/