public class hollowrectangle {
    public static void printrectangle(int rows,int colms){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=colms;j++){
                if(i==1||i==rows||j==1||j==colms){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        printrectangle(5,7);
        
    }
    
    
}
