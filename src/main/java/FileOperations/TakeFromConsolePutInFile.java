package FileOperations;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakeFromConsolePutInFile {
	public static void main(String[] args) throws IOException {
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(input);
		String name=br.readLine();
		
		FileWriter fw=new FileWriter("C:\\Harish\\Study\\Java\\FileOperations\\abc.txt");
		
		
	}
}
