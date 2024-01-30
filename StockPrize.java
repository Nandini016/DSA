import java.util.*;
public class StockPrize {
    public static int BuyandSell(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
                int profit = prices[i]-buyprice;
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buyprice =prices[i];
            }
        }
        return maxProfit;
        

    }
    public static void main(String args[]){
        int prices[] ={7,5,6,4,3,8};
    }
    
}
