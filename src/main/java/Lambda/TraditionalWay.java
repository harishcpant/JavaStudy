package Lambda;

interface NormalInterface{
	void method1();
	void method2();
}

public class TraditionalWay {
	
	public static void main(String[] args) {
		
		NormalInterface obj1=new NormalInterface() {
			
			public void method1() {
				System.out.println("----- Method 1---------------");			
			}
			
			
			public void method2() {
				System.out.println("----- Method 2---------------");			
			}
		};
		
		obj1.method1();
		obj1.method2();
		
	}	

}
