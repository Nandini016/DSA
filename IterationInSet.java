import java.util.*;
public class IterationInSet {
    public static void main(String args[]){
    HashMap<String ,Integer>hm = new HashMap<>();
    hm.put("India",250);
    hm.put("China",200);
    hm.put("Usa",300);
    hm.put("Nepal",150);
    hm.put("Indonesia",160);
    hm.put("Africa",130);
    hm.put("Bhutan",10);
    hm.put("ShriLanka",190);
    Set<String>keys = hm.keySet();
    System.out.println(keys);


    }
    
}
