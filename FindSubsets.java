public class FindSubsets {
    public static void findsubset(String str , String ans, int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);

            }
            return;
        }
        findsubset(str, ans+str.charAt(i), i+1); //fir yes choice
        findsubset(str, ans, i+1); //for no choice
    }
    public static void main(String args[]){
        String str = "abc";
        findsubset(str, " ", 0);
    }
    
}
