import java.util.ArrayList;

public class ArrayListsize {
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("size of the given arraylist is : "+list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+ " ");
        }


    }
     
    
}
