package Collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class StudentNew {
	int rollno;
	String name;
	int age;
	StudentNew(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator<StudentNew> {
	public int compare(StudentNew s1, StudentNew s2) {
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
} 

class NameComparator implements Comparator<StudentNew> {
	public int compare(StudentNew s1, StudentNew s2) {
		return s1.name.compareTo(s2.name);
	}
}

public class ComparatorTest{
	public static void main(String[] args) {
		LinkedList<StudentNew> al=new LinkedList<StudentNew>(); 
		al.add(new StudentNew(101, "Vijay", 23));
		al.add(new StudentNew(106, "Ajay", 27));
		al.add(new StudentNew(105, "Jai", 21));
		
		System.out.println("----Sorting by Name----");  
		//Using NameComparator to sort the elements  
		Collections.sort(al,new NameComparator());  
		//Traversing the elements of list  
		for(StudentNew st: al){  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}
		
		System.out.println("----sorting by Age----");  
		// Using AgeComparator to sort the elements
		Collections.sort(al, new AgeComparator());
		// Traversing the list again
		for (StudentNew st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
