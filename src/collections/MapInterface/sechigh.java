package collections.MapInterface;

import java.util.HashMap;
import java.util.HashSet;

public class sechigh {
    public static void main(String[] args) {
        HashMap<String, Integer> employeeSalaries = new HashMap<>();

        employeeSalaries.put("Alice", 50000);
        employeeSalaries.put("Bob", 70000);
        employeeSalaries.put("Charlie", 60000);
        employeeSalaries.put("Diana", 80000);
        employeeSalaries.put("Eve", 70000);

        HashSet<Integer> uniqueSalaries = new HashSet<>(employeeSalaries.values());
        if (uniqueSalaries.size() < 2) {
           System.out.println("Not enough unique salaries to determine the second highest.");
            return;
        }

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int salary : uniqueSalaries) {
            if (salary > highest) {
                secondHighest = highest;
                highest = salary;
            } else if (salary > secondHighest) {
                secondHighest = salary;
            }
        }

        System.out.println("Second highest salary: " + secondHighest);

        // Find employees with the second-highest salary
      // System.out.println("Employees with the second highest salary:");
      //  for (Map.Entry<String, Integer> entry : employeeSalaries.entrySet()) {
         //   if (entry.getValue() == secondHighest) {
           //     System.out.println(entry.getKey());
        // }
       //}
    }
}
