public class RemoveCycle {
    public  static class Node{
        int data ;
        Node next;
        public Node(int data){
            this.data = data;
            this.next=null;
        }

    }
    public static Node head;
    public static Node tail;
     public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

   
    public static void RemoveCycle(){
        Node slow =head;
        Node fast = head;
        boolean exist =false;
        while(fast!=null &&fast.next !=null){
            slow=slow.next;
            fast =fast.next.next;
            if(slow==fast){
                exist =true;
                break;
            }
            if(exist =false){
                return;
            }
        }
        slow =head;
        Node prev =null;
        while(slow!=fast){
            prev =fast;
            slow =slow.next;
            fast =fast.next;
        }
        prev =null;

        
    }
    public static void main(String args[]) {
        head = new Node(1);
        Node temp = new Node(2);

       head.next =temp;

        head.next.next = new Node(3);
        head.next.next.next = temp; // 
        System.out.println(isCycle());
        RemoveCycle();
        System.out.println(isCycle());

    }
    
}
