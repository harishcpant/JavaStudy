package DataStructure;

public class RemoveWhitespacesFromString {
	
	public static void main(String[] args) {
		String str1 = "Saket Saurav        is a QualityAna    list";
		String str2 = str1.replaceAll(" ", "");
		System.out.println(str2);
		
		//----without inbuilt methods----------
		String s1 = "Saket Saurav        is an Autom ation Engi ne      er";
        char[] chars = s1.toCharArray();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i<chars.length; i++)
        {
            if( (chars[i] != ' ') && (chars[i] != '\t') )
            {
                sb.append(chars[i]);
            }
        } 
        System.out.println(sb);
	}
}
