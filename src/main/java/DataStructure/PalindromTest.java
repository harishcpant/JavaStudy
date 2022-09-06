package DataStructure;

public class PalindromTest {
	public static void main(String[] args) {
		String str="abcdcba";
		
		int i=0;
		int j=str.length()-1;
		boolean isPalindrom=true;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				isPalindrom=false;
			}
			i++;
			j--;
		}
		
		if(isPalindrom==true) {
			System.out.println("String is palindrom..");
		}else {
			System.out.println("String is not palindrom..");
		}
	}
}
