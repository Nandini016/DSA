import java.util.Scanner;
public class PrimeNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int n= sc.nextInt();
        for (int i=2;i<=n-1;i++){
            if(n%i==0){
                System.out.println("Number is not Prime!!");
            }
            else{
                System.out.println("Number is Prime");
            }
        }


    }
}
