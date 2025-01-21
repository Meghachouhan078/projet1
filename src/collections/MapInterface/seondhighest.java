package collections.MapInterface;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class seondhighest {
    public static void main(String[]args){
        HashMap<String,Integer> salary=new HashMap<>();
        salary.put("megha",2000);
        salary.put("neha",3000);
        salary.put("ram",1000);
        salary.put("sita",4000);
        salary.put("mahak",9000);
        System.out.println("employee salary"+ salary);

        int secondhighestsalary=findsecondsalary(salary);
        if(secondhighestsalary!=Integer.MIN_VALUE){
            System.out.println("the second highest salary is:"+ secondhighestsalary);
        }else{
            System.out.println("not enough unique salary");
        }

    }
    public static int findsecondsalary(HashMap<String,Integer>salary){
        TreeSet<Integer> uniqueSalaries = new TreeSet<>(Comparator.reverseOrder());

        uniqueSalaries.addAll(salary.values());
        if (uniqueSalaries.size() < 2) {
            return Integer.MIN_VALUE; //
        }
        uniqueSalaries.pollFirst();

        return uniqueSalaries.first();
    }

    }
