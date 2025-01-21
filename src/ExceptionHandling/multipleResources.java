package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;

public class multipleResources {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("outputfile.txt");
             BufferedReader br = new BufferedReader(new FileReader("textfile.txt"))) {

            String text;
            while ((text = br.readLine()) != null) {
                byte arr[] = text.getBytes();
                fos.write(arr);
            }

            System.out.println("File content copied to another one.");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Resource are closed and message has been written into the textfile.txt");
    }
}