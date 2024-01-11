import java.util.*;
public class PushAtBottom {
    public static void Pushatbottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top =s.pop();
        Pushatbottom(s,data);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s =new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        Pushatbottom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());

        }


    }
}
