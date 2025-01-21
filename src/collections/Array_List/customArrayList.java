package collections.Array_List;
import java.util.ArrayList;
public class customArrayList {

        // Global variables of the class
        int roll;
        String name;
        int marks;
        long phone;
        // Constructor
        customArrayList(int roll, String name, int marks, long phone)
        {
            this.roll = roll;
            this.name = name;
            this.marks = marks;
            this.phone = phone;
        }
    }
    class GFG {
        int n = 4;

        public void addValues(int roll[], String name[], int marks[], long phone[])
        {
            ArrayList<customArrayList> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(new customArrayList(roll[i], name[i], marks[i], phone[i]));
            }
            printValues(list);
        }


        public void printValues(ArrayList<customArrayList> list)
        {

            for (int i = 0; i < n; i++) {
                customArrayList data = list.get(i);
                System.out.println(data.roll + " " + data.name + " " + data.marks + " " + data.phone);
            }
        }
        public static void main(String args[])
        {
            int roll[] = { 1, 2, 3, 4 };
            String name[]
                    = { "Shubham", "Atul", "Ayush", "Rupesh" };
            int marks[] = { 100, 99, 93, 94 };
            long phone[] = { 8762357381L, 8762357382L, 8762357383L, 8762357384L };
            GFG custom = new GFG();

            custom.addValues(roll, name, marks, phone);
        }
    }

