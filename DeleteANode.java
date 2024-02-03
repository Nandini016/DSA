public class DeleteANode {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data =data;
            //this.left =null;
           // this.right =null;
        }

    }
    public static Node Insert(Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = Insert(root.left,val);
        }
        else{
            root.right = Insert(root.right,val);
        }
        return root;
    }
    public static void Inorder(Node root){
      if(root!=null){
        Inorder(root.left);
        System.out.print(root.data +" ");
        Inorder(root.right);
      }
    }
    public static Node Delete(Node root,int val){
        if (root == null) {
            return root;
        }
        if(root.data<val){
            root.right = Delete(root.right,val);
        }
        else if(root.data>val){
            root.left =Delete(root.left,val);
        }
        else{
            //case1:No child(leaf node)
            if(root.left ==null&&root.right==null){
                return null;
            }//case 2:One Child
            if(root.left == null){
                return root.right;

            }
            else if(root.right ==null){
                return root.left;
            }//case 3 :2children
           else {
            Node Is= InorderSucessor(root.right);
            root.data = Is.data;
            root.right =Delete(root.right,Is.data);
           }
        }
        return root;
    }
    public static Node InorderSucessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String args[]){
        int arr[] = {8,5,3,1,4,6,10,11,14 };
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = Insert(root, arr[i]);
        }
        Inorder(root);
        System.out.println();
        Delete(root,1);
        System.out.println();
        Inorder(root);

    }
    
}
