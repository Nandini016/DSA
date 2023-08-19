import java.util.Scanner;
class calculator{
 public static void main(String args[]){
String yn;
do{
 Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:");
int num1=sc.nextInt();

System.out.println("Enter the Second number:");
int num2=sc.nextInt();

System.out.println("Select the operator(+,-,*,/)");
String operator=sc.next();

int result;

switch(operator){

case"+":
result=num1+num2;
System.out.println("Addition is:" +result);
break;

case"-":
result=num1-num2;
System.out.println("Substraction is:" +result);
break;

case"*":
result=num1*num2;
System.out.println("Multipicaton is:" +result);
break;

case"/":
result=num1/num2;
System.out.println("Division is: "+result);
break;
default:System.out.println("Invalid choice");
}
System.out.println("Do you want to continue(Press y for yes or n for no)");
yn=sc.next();
}while(yn.equals("y")||yn.equals("Y"));





}


}