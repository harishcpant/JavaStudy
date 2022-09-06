package DataStructure;

import java.util.Arrays;
import java.util.Collections;

public class Sorting1 {
	public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        String s = "78,67,87,-1,10,12,0";
        String arr[]=s.split(",");
        
        int[] intarr=new int[arr.length];
                
        for(int i=0; i<arr.length; i++) {
        	intarr[i] = Integer.parseInt(arr[i]);
        }
      
        System.out.println("Integer array "+Arrays.toString(intarr));
        
        Arrays.sort(intarr);   
        
        System.out.println("Integer array "+Arrays.toString(intarr));

	}
}
