import java.util.Scanner;
class checkPalindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int no=sc.nextInt();
        int temp= no;
        int reverse =0;
        while(temp!=0){
           int lastDigit= temp%10;
            reverse = reverse * 10 + lastDigit;
            temp /=10;
        }
         if(no == reverse)
         {
            System.out.println("The number " +no+" is palindrome");
         }
        else{
              System.out.println("The number " +no+" is not palindrome");
        }

    }
}
