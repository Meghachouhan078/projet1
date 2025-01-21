package ExceptionHandling;

import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class TrywithResources2 {
    public static void main(String[]args) {
        try (FileOutputStream fp = new FileOutputStream("test.txt")) {
            String msg = "Welcome to programming!";
            byte byteArray[] = msg.getBytes();
            fp.write(byteArray);  //writing data into file
            System.out.println("Message written to file successfuly!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
