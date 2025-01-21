package collections.Array_List;
import java.util.*;
public class list {
    public static void main(String[]args){
        List<String> li = new ArrayList<>();

        li.add("c");
        li.add("Java");
        li.add("Python");
        li.add("DSA");
        li.add("C++");

       System.out.println("elements of list are");
       for(String s:li){
           System.out.println(s);
       }
       System.out.println("element at index 1:"+li.get(1));
       li.set(1,"javaScript");
        System.out.println("Updated List: " + li);

        li.remove("C++");
        System.out.println("List After Removing Element: " + li);
    }
}


