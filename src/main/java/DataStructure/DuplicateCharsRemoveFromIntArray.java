package DataStructure;

import java.util.Arrays;

public class DuplicateCharsRemoveFromIntArray {

	public static void main(String[] args) {
		int[] origArr=new int[] {1,1,2,3,3,8,8,8,8};
		int origArrLen=origArr.length;
		
		for(int i=0;i<origArrLen;i++) {
			for(int j=i+1;j<origArrLen;j++) {
				if(origArr[i]==origArr[j]) {
					for(int p=j;p<origArrLen-1;p++) {
						origArr[p]=origArr[p+1];						
					}
					j=j-1;
					origArrLen=origArrLen-1;
				}
			}
		}

		for (int k = 0 ; k < origArrLen; k++){
			System.out.println(origArr[k]);
		}

	}

}
