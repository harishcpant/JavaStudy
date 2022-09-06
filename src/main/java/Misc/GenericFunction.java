package Misc;


	
public class GenericFunction {
		
		static <T> void genericDisplay (T element){
			System.out.println(element.getClass().getName()+"---"+element);		
		}
		
		public static void main(String[] args) {
		
			genericDisplay("Harish");
			genericDisplay(100);
			genericDisplay(10.5);
		}
}



