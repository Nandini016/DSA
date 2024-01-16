import java.util.*;
public class DequeExample {
    public static void main(String args[]){
     Deque<Integer>dq =new LinkedList<>();
     dq.addFirst(5);
     dq.addFirst(4);
     dq.addFirst(3);
     dq.addFirst(2);
     dq.addFirst(1);
     System.out.println(dq);
     dq.removeFirst();
     dq.removeLast();
     System.out.println(dq);

    }
    
}
