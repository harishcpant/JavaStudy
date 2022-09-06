package FileOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class ReadFromFileLineByLine {

	public static void main(String[] args) throws Exception {
		FileInputStream input=new FileInputStream(new File("C:\\Harish\\Study\\Java\\FileOperations\\test.txt"));
		int i;
		int j=0;
		while((i=input.read())!=-1) {
			System.out.println((char)i);
		}
	}

}
