import java.util.*;
public  class WeakestSoldier{
    static class Rows implements Comparable<Rows>{
         int Soldiers;
         int idx;
         public Rows(int Soldiers,int idx){
            this.Soldiers =Soldiers;
            this.idx=idx;
         }
         @Override
         public int compareTo(Rows r2){
            if(this.Soldiers ==r2.Soldiers){
                return this.idx-r2.idx;
            }else{
                return this.Soldiers-r2.Soldiers;
            }
         }
    }
    public static void main(String args[]){
        int army[][]={{1,0,0,0},
                      {1,1,1,1},
                      {1,0,0,0},
                      {1,0,0,0}};
                      int k=2;
        PriorityQueue<Rows> pq= new PriorityQueue<>();
        for(int i=0;i<army.length;i++){
            int count=0;
            for(int j=0;j<army[0].length;j++){
                count+=army[i][j]==1?1:0;

            }
            pq.add(new Rows(count,i));

        } 
        for(int i=0;i<k;i++){
            System.out.println("R"+pq.remove().idx);

        } 
    }
    
}
