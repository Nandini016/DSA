public class FloydCycle {
    public static class Node {
        int data;
        Node Next;

        public Node(int data) {
            this.data = data;
            this.Next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.Next != null) {
            slow = slow.Next;
            fast = fast.Next.Next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        head = new Node(1);
        head.Next = new Node(2);
        head.Next.Next = new Node(3);
        head.Next.Next.Next = head; // 
        System.out.println(isCycle());
    }
}
