import java.util.*;
public class CountDistincts {
    public static void main(String args[]){
        int nums[] ={4,3,2,6,5,3,4,2,1};
        System.out.println("size of original array :"+nums.length);
        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        System.out.println("Size of array with distinct elements:"+set.size());
       Iterator it = set.iterator();
       while(it.hasNext()){
       System.out.print(it.next()+" ");

       }


    }
    
}
