package Collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<>();
	    hm1.put(2, "two");
        hm1.put(1, "one");
        hm1.put(3, "three");
        hm1.put(3, "three");

        hm1.put(null, "null1");
        hm1.put(null, "null2");
        //hm1.remove(2);
        System.out.println(hm1);
        System.out.println(hm1.get(1));
        for(Map.Entry m:hm1.entrySet()) {
        	System.out.println(m.getKey()+ "--"+m.getValue());
        }
	}
}
