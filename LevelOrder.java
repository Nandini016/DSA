import java.util.*;
public class LevelOrder {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data =data;
            this.left=null;
            this.right=null;
        }
    }
     static class BinaryTree{
        static int idx =-1;
        public static Node buildTree(int node[]){
            idx++;
            if (idx >= node.length || node[idx] == -1) {
                return null;
            }
            Node newnode =new Node(node[idx]);
            newnode.left =buildTree(node);
            newnode.right =buildTree(node);
            return newnode;

        }
        public static void LevelOrder(Node root){
            if(root ==null){
                return;
            }
            Queue<Node> q =new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currnode =q.remove();
                if(currnode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currnode.data +" ");
                    if(currnode.left!=null){
                        q.add(currnode.left);
    
                    }
                    if(currnode.right!=null){
                        q.add(currnode.right);
                    }
                }
            }
    
    
        }


    }
    

    public static void main(String args[]){
        int node[] ={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6};
        BinaryTree tree =new BinaryTree();
        Node root =tree.buildTree(node);
       tree.LevelOrder(root);



    }
}
