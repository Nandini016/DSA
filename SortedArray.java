public class SortedArray {
    public static boolean IsSorted(int arr[] ,int i){
        if(i== arr.length-1 ){
            return true;
        }
       if(arr[i]>arr[i+1]){
        return false;
       }
       return IsSorted(arr, i+1);
    }
    public static void main(String args[]){
    int arr[] ={2,5,6,7,8,9};
    System.out.println(IsSorted(arr, 0));


    }
    
}
