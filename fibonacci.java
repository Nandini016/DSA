class fibonacci{

public static void main(String args[]){

int n=10,a=0,b=1;
System.out.println("fibbonacci series till" +n+ "terms is:");

for(int i=1;i<=n;i++){
  int c= a+b;
System.out.print(" "+c);
  a=b;
  b=c;
 }



}

}