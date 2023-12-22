public class lastoccu {
    public static int lastOccurnence(int arr[],int key ,int i){
        if(i== arr.length){
            return -1;
        }
        int isFound = lastOccurnence(arr, key, i+1);
        if(isFound==-1 &&arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String args[]){
        int arr[] ={2,4,9,7,8,5,9,0};
        System.out.println(lastOccurnence(arr, 9, 0));

    }
    
}
