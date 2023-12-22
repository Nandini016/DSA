public class PrintDec{
    public static void PrintNo(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n +" ");
        PrintNo(n-1);

    }
    public static void main(String args[]){
        int n=10;
        PrintNo(n);

    }
}