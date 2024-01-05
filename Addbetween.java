public class Addbetween {
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
    public void addinbetween(int indx,int data){
        Node newnode =new Node(data);
        if(indx==0){
            addFirst(data);
            return;
        }
        Node temp= head;
        int i=0;
        while(i<indx-1){
            temp =temp.Next;
            i++;
        }
        newnode.Next = temp.Next;
        temp.Next = newnode;
    }
    public static void main(String args[]){
        Addbetween ll =new Addbetween();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.AddLast(3);
        ll.AddLast(4);
        ll.addinbetween(2, 9);
        ll.print();

    }
    
}
