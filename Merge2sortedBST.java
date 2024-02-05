import java.security.cert.CertStoreException;
import java.util.*;
public class Merge2sortedBST {
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
    //inorder
    public static void getInorder(Node root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);
       

    }
    public static Node CreateBST(ArrayList<Integer>finalarr,int st,int end){
        if(st>end){
            return null;
        }
        int mid =(st+end)/2;
        Node root = new Node(finalarr.get(mid));
        root.left=CreateBST(finalarr, st, mid-1);
        root.right= CreateBST(finalarr, mid+1, end);
        return root;
    
       }
    public static Node mergeBST(Node root1,Node root2){
          ArrayList<Integer>arr1=new ArrayList<>();
          getInorder(root1,arr1);
          ArrayList<Integer>arr2 =new ArrayList<>();
          getInorder(root2,arr2);  
          //merge
    int i=0,j=0;
    ArrayList<Integer> finalarr = new ArrayList<>();
    while(i<arr1.size()&&j<arr2.size()){
        if(arr1.get(i)<arr2.get(j)){
            finalarr.add(arr1.get(i));
            i++;
        }
        else{
            finalarr.add(arr2.get(j));
            j++;
        }

    }
    while(i<arr1.size()){
        finalarr.add(arr1.get(i));
        i++;
    }
    while(j<arr2.size()){
        finalarr.add(arr2.get(j));
        j++;

    }
    return CreateBST(finalarr, 0, finalarr.size()-1);

   }
   public static void preorder(Node root){
    if(root==null){
        return ;
    }
    System.out.println(root.data);
    preorder(root.left);
    preorder(root.right);
   }
   public static void main(String args[]){
    Node root1 = new Node(4);
    root1.left=new Node(3);
    root1.right =new Node(5);

    Node root2 = new Node(6);
    root2.left=new Node(5);
    root2.right = new Node(7);
   Node root = mergeBST(root1, root2);
    preorder(root);;


   }
   
}
