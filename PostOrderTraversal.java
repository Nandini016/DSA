public class PostOrderTraversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
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

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data);

        }

       
        
    }
    public static void main(String args[]) {
        int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6};
        BinaryTree tree = new BinaryTree();
        Node root = tree.Buildtree(node);
        System.out.println("Postorder Traversal:");
        tree.postorder(root);
    }
    
}
