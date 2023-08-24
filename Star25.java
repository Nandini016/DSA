public class Star25 {
    public static void main(String args[]){
        int n=11;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==((n-1)/2)-i){
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
