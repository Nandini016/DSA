import java.util.*;
public class MinAbsoluteDiff {
    public static void main(String args[]){
        int a[] ={2,1,3};
        int b[] ={1,2,3};
        Arrays.sort(a);
        Arrays.sort(b);
        int minabsDiff=0;
        for(int i=0;i<a.length;i++){
            minabsDiff+=Math.abs(a[i]-b[i]);
           


        }
        System.out.println("min absolute diffrenece is "+minabsDiff);
    }
    
}
