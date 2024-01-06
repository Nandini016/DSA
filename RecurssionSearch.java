public class RecurssionSearch {
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
     public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data ==key){
            return 0;
        }
        int indx =helper(head.next,key);
        if(indx==-1){
            return -1;
        }
        return indx+1;

        }
     
     public int recSearch(int key){
        return helper(head,key);

     }
     public static void main(String args[]){
        RecurssionSearch  ll= new RecurssionSearch ();
        ll.addatfirst(2);
        ll.addatfirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.print();
       System.out.println( ll.recSearch(4));
       System.out.println( ll.recSearch(7));
       


     }

    
}
