 public class SearchinLL{
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
     public int search(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp =temp.next;
            i++;
        }
        return-1;
     }
     public static void main(String args[]){
        SearchinLL ll= new SearchinLL();
        ll.addatfirst(2);
        ll.addatfirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.print();
        System.out.println(ll.search(3));


     }


 }