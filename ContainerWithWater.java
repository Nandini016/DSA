import java.util.ArrayList;
public class ContainerWithWater{
    public static int StoreWater(ArrayList<Integer>height){
        int maxWater =0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int hgt=Math.min(height.get(rp),height.get(lp));
            int width =rp-lp;
            int currwater=hgt*width;
            maxWater=Math.max(currwater,maxWater);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer>height = new ArrayList<>();
        height.add(3);
        height.add(5);
        height.add(6);
        height.add(7);
        height.add(9);
        height.add(12);
        height.add(13);
        height.add(10);

        System.out.println(StoreWater(height));

    }

}
