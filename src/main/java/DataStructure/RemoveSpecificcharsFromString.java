package DataStructure;

public class RemoveSpecificcharsFromString {

	public static void main(String[] args) {
//		String s="abbcddebbff";
//		String removalString="b";
//		String strNew = s.replaceAll(removalString, "");
//		System.out.println("New String is :- "+strNew);
		
		String oldString="abbcddebbff";
		String newString="";
		char remChar='f';
		char ch[]=oldString.toCharArray();
		for(int i=0;i<oldString.length();i++) {
			if(oldString.charAt(i)!=remChar) {
				newString=newString+oldString.charAt(i);
			}
		}
		System.out.println("newString--> "+newString);
	}

}
