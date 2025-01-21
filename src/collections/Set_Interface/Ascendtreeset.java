package collections.Set_Interface;

import java.util.TreeSet;

public class Ascendtreeset {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(45);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);

        System.out.println("Numbers in ascending order:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println("\nFirst element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());
    }
}
