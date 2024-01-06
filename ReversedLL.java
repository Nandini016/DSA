public class ReversedLL {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data =data;
            this.next=null;
        }
       
    }
     public static Node head;
     public static Node tail;

     public void addatfirst(int data){
        Node newnode =new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next =head;
        head= newnode;
     }
     public void addlast(int data){
        Node newnode = new Node(data);
        if(head==null){
         head=tail=newnode;
         return;
        }
        tail.next=newnode;
        tail=newnode;
     }
     public void print(){
        if(head==null){
            System.out.println("The linkedList is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.println("null");
     }
     public void Reverse(){
        Node prev=null;
        Node curr =tail=head;
        Node Next;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;


        }
        head=prev;
     }
     public static void main(String args[]){
       ReversedLL ll= new ReversedLL ();
        ll.addatfirst(2);
        ll.addatfirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.print();
        ll.Reverse();
        ll.print();
      
       


     }
    
}
