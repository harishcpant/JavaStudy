package FunIntPkg;

@FunctionalInterface
interface FIMethodDefault{
	void method1();
	
//	default void method2() {
//		System.out.println("Default Interface Method 2 inside Functional Interface");
//	}
}


public class FIWithDefault implements FIMethodDefault{
	
	@Override
	public void method1() {
		System.out.println("Mthod 1 Interface method is overridden...");
		
	}
	
//	public static void main(String[] args) {
//		FIWithDefault testObj=new FIWithDefault();
//		testObj.method1();
//		testObj.method2();
//		
//	}


}
