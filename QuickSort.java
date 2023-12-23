public class QuickSort {
        public static void Printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }

        int pix = partition(arr,si,ei);
        quicksort(arr,si,pix-1);
        quicksort(arr,pix+1,ei);

    }
    public static int partition(int arr[],int si,int ei)
    {
        int pivot =arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                int temp =arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        
        }
               i++;
            int temp =pivot;
                arr[ei] = arr[i];
                arr[i] = temp;
                return i;
    }
                
    public static void main(String args[]){
        int arr[]={2,4,3,5,6,8};
        quicksort(arr, 0, arr.length-1);
        Printarr(arr);


    }




    
}
 