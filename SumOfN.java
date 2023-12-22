public class SumOfN {
    public static int printSum(int n){
        if(n==0){
            return 0;
        }
        int son = printSum(n-1);
        int sum = n+son;
        return sum;
    }
    public static void main(String args[]){
        int n =5;
        System.out.println(printSum(n));

    }
    
}
