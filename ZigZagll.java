public class ZigZagll {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void zigzag() {
        if (head == null || head.next == null) {
            return;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node Next;

        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }

        Node left = head;
        Node right = prev;
        Node NextL, NextR;

        while (left != null && right != null) {
            NextL = left.next;
            left.next = right;
            NextR = right.next;
            right.next = NextL;
            left = NextL;
            right = NextR;
        }

        tail = right; // Update the tail to the last node of the reversed second half
    }

    public static void main(String args[]) {
        ZigZagll ll = new ZigZagll();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.zigzag();
        ll.print();
    }
}
