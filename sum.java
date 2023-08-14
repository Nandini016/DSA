import java.util.Scanner;
class sum
{
 public static void main(String args[])
 {
Scanner sc=new Scanner(System.in);
int  n,sum=0;
System.out.println("Enter the number you want the sum of:");
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
 sum=sum+i;
}
System.out.println("Sum of "+n+"numbers is="+sum);


 } 

}
