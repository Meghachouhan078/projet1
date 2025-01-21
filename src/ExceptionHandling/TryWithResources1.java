package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResources1 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String line = br.readLine();
           // System.out.println(line); // Optional: Print the line to confirm it's read
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}