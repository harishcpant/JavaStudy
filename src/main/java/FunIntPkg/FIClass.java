package FunIntPkg;


interface FIMethod1 {
    void method1();
}


public class FIClass implements FIMethod1{
	
	public void method1() {
		System.out.println("FITest1 implementation...");
	}
	
	public static void main(String[] args) {
		FIClass FIClassObj=new FIClass();
		FIClassObj.method1();		
	}
}