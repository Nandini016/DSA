public class Pyramid17 {
    public static void main(String args[]){
        int n= 7;
        for(int i =0;i<n;i++){
            for(int j=0;j<5;j++){
                if(i==0||j==0||j==4||i==3){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
