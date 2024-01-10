public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
              this.data=data;
              this.next=null;
              this.prev =null;
        }

    }
    public Node head;
    public Node tail;
    public static int size=0;

    public void AddFirst(int data){
        Node newnode =new Node(data);
        size++;
        if(head==null){
            head = tail =newnode;
            return;
        }
        newnode.next =head;
        head.prev =newnode;
        head = newnode;

    }
    public void AddLast(int data){
        Node newnode  =new Node(data);
        size++;
        if(tail==null){
            head=tail=newnode;
            return;
        }
        newnode.next =null;
        newnode.prev =tail;
        tail.next =newnode;
        tail =newnode;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("the list is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val= head.data;
        tail =tail.prev;
        tail.next =null;
        size--;
        return val;
    }
    public void print(){
        Node curr =head;
        while(curr!=null){
            System.out.print(curr.data+ "<->");
            curr=curr.next;
            
        }
        System.out.println("null");

    }
    public int removeFirst(){
        if(head==null){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;

        }
        int val=head.data;
        head =head.next;
        head.prev =null;
        size--;
        return val;

    }
    public static void main(String args[]){
        DoublyLL dll = new DoublyLL();
        dll.AddFirst(3);
        dll.AddFirst(2);
        dll.AddFirst(1);
        dll.print();
        System.out.println(dll.size);
        dll.removeFirst();
        
        dll.print();

        dll.AddLast(4);
        dll.AddLast(5);
        dll.print();
        System.out.println(dll.size);
        dll.removeLast();
        dll.print();


    }

    
}
