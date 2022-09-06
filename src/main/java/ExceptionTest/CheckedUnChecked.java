package ExceptionTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedUnChecked {

	public static void main(String[] args)  throws Exception {
		
		int i=10/0;
		//FileInputStream fis=new FileInputStream("path");
		
//		try {
//			CheckedUnChecked.dividebyzero();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	public static void dividebyzero() throws Exception{
		int i=10/0;
		System.out.println(i);
	}

}
