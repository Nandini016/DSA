import java.util.*;
public class CreateHashMap{
  public static void main(String[] args) {
    HashMap<String ,Integer>hm =new HashMap<>();
    //insert =O(1)
    hm.put("India",100);
    hm.put("China",200);
    hm.put("Nepal",10);
    hm.put("US",150);
    System.out.println(hm);
    //get=O(1)
    int population=hm.get("India");
     System.out.println(population);
     //contains key =O(1) boolean type
     System.out.println(hm.containsKey("India"));
     System.out.println(hm.containsKey("Indonesia"));
      //remove=O(1)
      hm.remove("China");
      System.out.println(hm);
      //size
      System.out.println(hm.size());
      //isEmpty()
      //hm.clear();
      System.out.println(hm.isEmpty());

  }
}

