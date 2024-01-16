import java.util.*;
public class ReverseQueue{
    public static void Reverse(Queue<Integer>q){
        Stack<Integer> s =new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    
        // Pop elements from the stack and add them back to the queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    public static void main(String args[]){
        Queue<Integer> q =new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
         Reverse(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+ " ");
        }
        System.out.println();
    }

}