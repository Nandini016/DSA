public class Search {
    static class Node{
        Node children[] = new Node[26];
        boolean eow =false;
        Node(){
            for(int i=0;i<26;i++){
                children[i] =null;
            }
        }
    }
    public static Node root = new Node();//create a root node

    public static void insert(String word){//insert in root node
        Node curr = root;
        for(int level=0;level<word.length();level++){
            int idx =word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx] =new Node();

            }
            curr = curr.children[idx];
        }
        curr.eow =true;
    }
    public static boolean Search(String key){
        Node curr = root;
        for(int level=0;level<key.length();level++){
            int idx =key.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
         return curr.eow ==true;

    }
    public static void main(String args[]){
        String word[]={"the", "a", "there", "their", "any", "thee"};
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
 
         }
         System.out.println(Search("thee"));
         System.out.println(Search("th"));
         System.out.println(Search("and"));
    }
    
}
