public class PalindromeLL {
    public class Node{
        int data;
        Node Next;
        public Node(int data){
            this.data = data;
            this.Next =null;

        }
       
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);//creating a new node
        if(head==null){//if node is empty
            head=tail=newNode;
            return;

        }
        newNode.Next =head;//linking the node at the starting
        head = newNode;//changing the new node as the head
    }
    public void AddLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        tail.Next =newNode;
        tail = newNode;

    }
    public void print(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.Next;

        }
        System.out.println("null");

    }
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null &&fast.Next !=null){
            slow=slow.Next;
            fast=fast.Next.Next;

        }
        return slow;


    }
    public boolean checkpalindrome(){
        if(head==null||head.Next!=null){
            return true;

        }
        Node midNode=findMid(head);
        Node prev= null;
        Node curr =midNode;
        Node next;
        while(curr!=null){
            next =curr.Next;
            curr.Next =prev;
            prev =curr;
            curr=next;
        }
        Node right=prev;
        Node left =head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left =left.Next;
            right =right.Next;

        }
         return true;


    }
    public static void main(String args[]){
        PalindromeLL ll =new PalindromeLL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.AddLast(2);
        ll.AddLast(1);
       System.out.println( ll.checkpalindrome());

    
    }
}
