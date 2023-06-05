package CollectionsExample;

import java.util.HashSet;


public class RemoveDuplicateCharsUsingSet {
    public static void main(String[] args) {
        String withDup="abbcdeeffg";
        String withoutDup="";
        char[] input=withDup.toCharArray();
        HashSet<Character> set1=new HashSet<>();
        for(int i=0;i<=input.length-1;i++){
            set1.add(input[i]);
        }
        System.out.println(set1.toString());

    }
}
