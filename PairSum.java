import java.util.ArrayList;
public class PairSum {
    public static boolean findPairSum(ArrayList<Integer>list, int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp++;

            }
            else{
                rp--;
            }
        }
        return false;

    }
    public static void main(String args[]){
        ArrayList<Integer>list =new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(9);
        System.out.println(findPairSum(list, 10));



    }
    
}
