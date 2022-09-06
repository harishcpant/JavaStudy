package Collection;
import java.util.*;
public class LinkedHashMap2 {

	public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm1
        = new LinkedHashMap<Integer, String>();               
        
        hm1.put(2, "Two");
        hm1.put(3, "Three");        
        hm1.put(5, "Five");
        hm1.put(1, "One");
        hm1.put(4, "Fooooour");  
        hm1.put(4, "Four");
        hm1.remove(3);      
        
        System.out.println("LinkedHashMap Values : "+hm1);
        System.out.println(hm1.get(4));
        for (Map.Entry m:hm1.entrySet()) {
        	System.out.println(m.getKey());
        }
        
        TreeMap<Integer,String> tm1=new TreeMap<Integer,String> (hm1);
        System.out.println(tm1);
	}

}
