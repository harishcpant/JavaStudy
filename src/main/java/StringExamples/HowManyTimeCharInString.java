package StringExamples;

import java.util.HashMap;

public class HowManyTimeCharInString {
    public static void main(String[] args) {
//        String str="HarishChandraPant";
//        char ch='a';
//        int count=0;
//
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)==ch){
//                count++;
//            }
//        }
//        System.out.println("Char a is coming no of times : "+count);

        // Another way to do this
        String str="premkumarjaywardhan";
        char ch='a';
        char[] stch= str.toCharArray();
        int count=0;
        HashMap map=new HashMap(); //key =char //value = count
        for(char c:stch){
            if(map.containsKey(c)){
                count=(int)map.get(c)+1;
                map.put(c,count);
            }else {
                map.put(c, 1);
            }
        }
        System.out.println(map.get('a'));

    }
}
