package collections.Set_Interface;

import java.util.HashSet;

public class common {
public static void main(String[] args)
{
    HashSet<String> set1 = new HashSet<String>();
       set1.add("Red");
    set1.add("Pink");
    set1.add("Green");
    set1.add("Black");
    set1.add("White");
    set1.add("Yellow");
    System.out.println("Frist HashSet : "+set1);
    HashSet<String> set2 = new HashSet<String>();
    set2.add("Yellow");
    set2.add("Purple");
    set2.add("Black");
    set2.add("Orange");
    set2.add("Pink");
    System.out.println("Second HashSet : "+set2);
    set1.retainAll(set2);
    System.out.println("HashSet content : "+set1);
}}