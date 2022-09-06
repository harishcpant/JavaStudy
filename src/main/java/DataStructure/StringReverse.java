package DataStructure;

public class StringReverse {

	public static void main(String[] args) {
      String str= "Geeks", nstr="";
      char ch;
       
      System.out.println("Original word: Geeks");
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
        System.out.println("nstr : "+nstr);
      }
      System.out.println("Reversed word: "+ nstr);
    
	}

}
