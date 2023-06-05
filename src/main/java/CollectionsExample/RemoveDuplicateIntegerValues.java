package CollectionsExample;

import java.util.HashSet;

public class RemoveDuplicateIntegerValues {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,8,8,8,8};
        HashSet<Integer> set1=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set1.add(arr[i]);
        }
        System.out.println(set1.toString());
    }
}
