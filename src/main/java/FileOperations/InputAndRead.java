package FileOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputAndRead {

	public static void main(String[] args) throws IOException {
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(input);
		
		System.out.println("Enter your name :");
		String name=br.readLine();
		System.out.println(name);
	}

}
