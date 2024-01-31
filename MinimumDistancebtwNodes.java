public class MinimumDistancebtwNodes {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    public static Node lca(Node root,int n1,int n2){
        if(root ==null||root.data==n1||root.data==n2){
            return root;
        }
        Node leftlca =lca(root.left,n1,n2);
        Node rightlca =lca(root.right,n1,n2);
        if(leftlca==null){
            return rightlca;
        }
        if(rightlca==null){
            return leftlca;
        }
        return root;

    }
    public static int lcaDst(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftlcadst=lcaDst(root.left, n);
        int rightlcaDst=lcaDst(root.right, n);
        if(leftlcadst==-1&&rightlcaDst==-1){
            return -1;
        }
        else if(leftlcadst==-1){
            return rightlcaDst+1;
        }
        else{
            return leftlcadst+1;
        }
    }
    public static int minDis(Node root ,int n1,int n2){
        int leftDst=lcaDst(root.left,n1);
        int rightDst=lcaDst(root.right,n2);
        return leftDst+rightDst;
    }
    public static void main(String arge[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4, n2 = 5;
        System.out.println(minDis(root, n1, n2));
    }
    
}
