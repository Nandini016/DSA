public class printReverse {
    public static void main(String args[]){
        int n= 12345;
        int revnum=0;
        while(n>0){
            int lastdigit = n%10;
            revnum= revnum*10 + lastdigit;
             n= n/10;
        
        }
        System.out.println(revnum);
    }
    
}