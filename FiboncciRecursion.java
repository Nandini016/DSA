public class FiboncciRecursion {
    public static int Fibonacci(int n){
        if(n==0 ||n==1){
            return n;
        }
        int fnm1= Fibonacci(n-1);
        int fnm2= Fibonacci(n-2);
        int fibo = fnm1+fnm2;
        return fibo;
    }
    public static void main(String args[]){
        int n=20;
        System.out.println(Fibonacci(n));

    }
    
}
