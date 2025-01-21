package collections.Array_List;

import java.util.Stack;

public class PeekStack {
    public static void main(String[]args){
        Stack<String> stack = new Stack<String>();

        // Use push() to add elements into the Stack
        stack.push("Welcome");
        stack.push("To");
        stack.push("the");
        stack.push("First");
        stack.push("program");

        // Displaying the Stack
        System.out.println("Initial Stack: " + stack);
        System.out.println("the element at the top of the stack is" +stack.peek());
        System.out.println("Final Stack: " + stack);

    }
}
