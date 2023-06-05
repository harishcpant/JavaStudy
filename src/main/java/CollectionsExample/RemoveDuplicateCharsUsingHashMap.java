package CollectionsExample;

import java.util.HashMap;

public class RemoveDuplicateCharsUsingHashMap {
    public static void main(String[] args) {
        String withDup="abbcdeeffg";
        String withoutDup="";
        char[] input=withDup.toCharArray();
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<=input.length-1;i++){
            System.out.println("Value -- >"+input[i]);
            if(!map.containsKey(input[i])){
                map.put(input[i],1);
                withoutDup=withoutDup+input[i];
            }
        }
        System.out.println(withoutDup);
    }
}
