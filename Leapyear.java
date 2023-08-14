import java.util.Scanner;
class Leapyear{
 public static void main(String args[]){
 
   int year;
System.out.println("Enter the year you want to check:");
Scanner sc= new Scanner(System.in);
year=sc.nextInt();

 if((year%400==0)&&(year%100!=0)||(year%4==0))
{
  System.out.println("It is a leap Year");
}

else{
System.out.println("Not a leap year!");
}





}
}

