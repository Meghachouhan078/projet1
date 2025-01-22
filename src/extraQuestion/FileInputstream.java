package extraQuestion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputstream {

    public static void main (String[]args){
        try{
            FileInputStream fi = new FileInputStream("file.txt");
            int ch;
            while((ch=fi.read())!=-1){
                System.out.println((char)ch);
            }
            fi.close();
        }
            catch (FileNotFoundException e) {
                System.out.println(
                        "File not found: Ensure the file exists.");
            }
        catch (IOException e) {
                System.out.println(
                        "An error occurred while reading the file.");
            }
        }
    }

