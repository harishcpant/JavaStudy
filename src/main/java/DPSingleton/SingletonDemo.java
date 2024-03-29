package DPSingleton;

class SingletonDemo { 
	 public static void main(String args[]) 
	 { 
	     Singleton x = Singleton.getInstance(); 
	     Singleton y = Singleton.getInstance(); 
	     Singleton z = Singleton.getInstance(); 
	     System.out.println("Hashcode of x is "
	                        + x.hashCode() + "-"+x.s); 
	     System.out.println("Hashcode of y is "
	                        + y.hashCode()+ "-"+y.s); 
	     System.out.println("Hashcode of z is "
	                        + z.hashCode()+ "-"+z.s); 

	     if (x == y && y == z) { 
	         System.out.println( 
	             "Three objects point to the same memory location on the heap i.e, to the same object"); 
	     } 

	     else { 
	         System.out.println( 
	             "Three objects DO NOT point to the same memory location on the heap"); 
	     } 
	 } 
	}

class Singleton { 
 // Static variable reference of single_instance 
 private static Singleton single_instance = null; 
 public String s; 

 private Singleton() 
 { 
     s = "Hello I am a string part of Singleton class"; 
 } 
 // Static method 
 // Static method to create instance of Singleton class 
 public static Singleton getInstance() 
 { 
     if (single_instance == null) 
         single_instance = new Singleton(); 

     return single_instance; 
 } 
} 


