package collections.Array_List;

import java.util.Stack;

public class OperationStack {
    public static void main(String[]args){
        Stack s1 =new Stack();
        Stack<String> s2=new Stack<String>();
        s1.push("the");
        s1.push("All");
        s1.push("Geeks");

        s2.push("megha");
        s2.push("For");
        s2.push("chouhan");

        // Printing the Stack Elements
        System.out.println(s1);
        System.out.println(s2);
    }
}

