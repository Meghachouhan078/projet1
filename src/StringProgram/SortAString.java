package StringProgram;
import java.util.Arrays;

public class SortAString {
        public static String sortString(String inputString)
        {
            char ch[] = inputString.toCharArray();

            Arrays.sort(ch);
            return new String(ch);
        }

        public static void main(String[] args)
        {
            String inputString = "megha";
            String outputString = sortString(inputString);

            System.out.println("Input String : " + inputString);
            System.out.println("Output String : " + outputString);
        }
    }

