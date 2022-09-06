package Collection;


import java.util.*;

public class ArrayListTest {
	public static void main(String[] args) {
		
//		ArrayList<Integer> al=new ArrayList<Integer>();  
//		//LinkedList<String> al=new LinkedList<String>();  
//		al.add(50);  
//		al.add(25);  
//		al.add(13);  
//		al.add(25);   
		
		
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Ram");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");   
		Collections.sort(al);
		System.out.println(al);
		int index=Collections.binarySearch(al, "Vijay");
		System.out.println(index);
		
		
		
//		Iterator<String> itr=al.iterator();  
//		while(itr.hasNext()){  
//		System.out.println(itr.next());  
//		} 
	}
}
