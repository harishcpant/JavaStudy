package DataStructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NoOfWordsInAFile {

	public static void main(String[] args) throws IOException {
		String line;  
        int count = 0;  
        FileReader file = new FileReader("C:\\Harish\\Study\\Java\\EclipseWS\\datastructure\\src\\test\\java\\datastructure\\datastructure\\data.txt");  
        BufferedReader br = new BufferedReader(file);  
  
        //Gets each line till end of file is reached  
        while((line = br.readLine()) != null) {  
            //Splits each line into words  
        	System.out.println(line);
            String words[] = line.split("");  
            //Counts each word  
            count = count + words.length;  
  
        }  
  
        System.out.println("Number of words present in given file: " + count);  
        br.close();  
	}

}
