package Generics;

class Test<A,B>
{
	A obj1;
	B obj2;
	
	Test(A obj1,B obj2)
	{
		this.obj1=obj1;
		this.obj2=obj2;
	}
//	public T getObject()
//	{
//		return this.obj;
//	}
}

public class GenericsClass {

	public static void main(String[] args) 
	{
//		Test <Integer> objInt=new Test<Integer>(15);
//		
//		System.out.println(objInt.getObject());
//		
//		Test <String> objStr=new Test<String>("hello world");
//		
//		System.out.println(objStr.getObject());
		Test <String, Integer> obj =
	            new Test<String, Integer>("GfG", 15);
		
		System.out.println(obj.obj1);
		System.out.println(obj.obj2);
	}
}
