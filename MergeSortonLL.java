public class MergeSortonLL{
    public class Node{
        int data;
        Node Next;
        public Node(int data){
            this.data =data;
            this.Next =null;

        }
    

    }
     public Node head;
        public Node tail;

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
        private Node GetMid(Node head){
            Node slow =head;
            Node fast =head.Next;
            while(fast!=null &&fast.Next!=null){
                slow = slow.Next;
                fast =fast.Next.Next;


            }
            return slow;
        }
        private Node merge(Node head1,Node head2){
            Node mergell =new Node(-1);
            Node temp =mergell;
            while(head1 !=null &&head2!=null){
                if(head.data <=head2.data){
                    temp.Next=head1;
                    head1=head1.Next;
                    temp=temp.Next;

                }else {
                    temp.Next =head2;
                    head2 =head2.Next;
                    temp=temp.Next;
                }
            }
            while(head1 !=null){
                temp.Next =head1;
                head1 =head1.Next;
                temp =temp.Next;

            }
            while(head2!=null){
                temp.Next =head2;
                head2 =head2.Next;
                temp =temp.Next;

            }
            return mergell.Next;
        }
        public Node MergeSort(Node head){
            if(head ==null ||head.Next==null){
                return head;
            }
            Node mid =GetMid(head);
            Node rightHead =mid.Next;
            mid.Next =null;
            Node newleft =MergeSort(head);
            Node newRight =MergeSort(rightHead);

            
                return merge(newleft ,newRight);
        }
        public static void main(String args[]){
            MergeSortonLL ll = new MergeSortonLL();
            ll.addFirst(1);
            ll.addFirst(2);
            ll.addFirst(3);
            ll.addFirst(4);
            ll.addFirst(5);
            ll.print();
            ll.head =ll.MergeSort(ll.head);
            ll.print();



        }
}