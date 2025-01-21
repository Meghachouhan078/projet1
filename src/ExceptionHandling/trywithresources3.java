package ExceptionHandling;

import java.io.FileOutputStream;

public class trywithresources3 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("textfile.txt")) {
            String text = "hello world. This is my java program";
            byte arr[] = text.getBytes();
            fos.write(arr);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Resource are closed and message has been written into the file");
    }
}