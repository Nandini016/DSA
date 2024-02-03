public class ValidBST{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
           // this.left=null;
           // this.right=null;

        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root= new Node(val);
            return root;
        }
        if(root.data>val){
            root.left =insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }
        return root;

    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);

        
    }
    public static boolean isValid(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null&&root.data<=min.data){
            return false;
        }
        else if(max!=null &&root.data>=max.data){
            return false;
        }
        return isValid(root.right,root,max)&&isValid(root.left,min,root);

    }
    public static void main(String args[]){
        int arr[] ={1,1,1};
        Node root =null;
        for(int i=0;i<arr.length;i++){
            root =insert(root,arr[i]);


        }
        inorder(root);
        System.out.println();
        if(isValid(root, null, null)){
            System.out.println("valid");
        }
        else{
            System.out.println("Not valid");
        }

    }
}
