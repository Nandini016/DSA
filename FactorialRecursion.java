public class FactorialRecursion {
    public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        int fnm = Factorial(n-1);
       int Fn = n*fnm;
       return Fn;

    }
    public static void main(String args[]){
        int n=5;
        System.out.println(Factorial(n));

    }
    
}
