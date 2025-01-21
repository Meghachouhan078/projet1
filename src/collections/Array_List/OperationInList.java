package collections.Array_List;

import java.util.ArrayList;

public class OperationInList {
    public static void main(String[]args){
        ArrayList<String> al=new ArrayList<>();
        al.add("Geeks");
        al.add("Geeks");
        System.out.println("original list"+al);

        //add element at specific index
        al.add(1,"for");
        System.out.println("after adding element at index 1 "+al);
        //remove element at index
        al.remove(0);
        System.out.println("Element removed from index 0 : "+ al);
        //remove geeks
        al.remove("Geeks");
        System.out.println("Element Geeks removed : "+ al);
         //update value at index 0
        al.set(0,"GFG");
        System.out.println("List after updation of value : "+al);

    }
}
