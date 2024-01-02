import java.util.ArrayList;
public class ArrayListoperation{

    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        int element =list.get(2);
        System.out.println(element);
        list.remove(3);
        System.out.println(list);
        list.set(2, 4);
        System.out.println(list);
        System.out.println(list.contains(2));
    }
}