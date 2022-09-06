package FileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadLineByLine {
	public static void main(String[] args) throws Exception {
		FileReader fis=new FileReader(new File("C:\\Harish\\Study\\Java\\FileOperations\\BufferedReaderTest.txt"));
		BufferedReader br=new BufferedReader(fis);
		String line;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
	}
}
