public class KthLargest {
    public static void main(String args[]){
        int[] arr ={2,4,5,6,3,7,8};
        int k=4;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
            if(i==k-1){
                System.out.println("kth largest element is "+arr[i]);
            }
        }
    }
    
}
