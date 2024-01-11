import java.util.*;

public class ReverseAStack {

    // Function to push an element to the bottom of the stack
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    // Function to reverse the stack using recursion
    public static void reverseStack(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int top = s.pop();
            reverseStack(s);
            pushAtBottom(s, top);
        }
    }

    // Function to print the stack
    public static void print(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);

       
        reverseStack(s);

        System.out.println("Reversed Stack:");
        print(s);
    }
}
