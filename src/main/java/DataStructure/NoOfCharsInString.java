package DataStructure;

public class NoOfCharsInString {

	public static void main(String[] args) {
		String string = "how are you";    
        int count = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        } 
        
        System.out.println("Total number of characters in a string: " + count);   

	}

}
