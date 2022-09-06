package Collection;

class A{
	A(){
		System.out.println("class A constructor");
	}
	public void areaofA() {
		System.out.println("Area of A..");
	}
	
}

public class B extends A {
	
	B(){
		System.out.println("class B constructor");
	}

	public void areaOfB() {
		super.areaofA();
		System.out.println("Area of B..");
	}
	
	public static void main(String[] args) {
		B obj1=new B();
		obj1.areaOfB();

	}

}




