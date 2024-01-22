public class PreorderTree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {
        static int idx = -1;

        public Node Buildtree(int node[]) {
            idx++;
            if (idx >= node.length || node[idx] == -1) {
                return null;
            }
            Node newnode = new Node(node[idx]);
            newnode.left = Buildtree(node);
            newnode.right = Buildtree(node);
            return newnode;
        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");  // Use print instead of println to have a space-separated output
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String args[]) {
        int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6};
        BinaryTree tree = new BinaryTree();
        Node root = tree.Buildtree(node);
        System.out.println("Preorder Traversal:");
        tree.preorder(root);
    }
}
