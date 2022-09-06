package FileOperations;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Harish\\Study\\Java\\FileOperations\\test.txt");
		f1.createNewFile();

	}

}
