public class Pyramid14{
    public static void main(String args[]){
        int n=4;
        char ch='A';
        for(int i=1; i<=n ;i++){
            for( int chs =1; chs<=i;chs++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
