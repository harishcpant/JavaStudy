package DataStructure;

public class BubbleSort {

	public static void main(String[] args) {
		int[] origArr= {15,5,30,25,14};
		int arrLen=origArr.length;
		int temp=0;
		
		for(int i=0;i<arrLen;i++) {
			for(int j=1;j<=arrLen-1;j++) {
				if(origArr[j-1]>origArr[j]) {
					temp=origArr[j-1];
					origArr[j-1]=origArr[j];
					origArr[j]=temp;
				}				
			}
		}
		
		System.out.println("Array after Bubble sort..");
		for(int k=0;k<arrLen;k++) {
			System.out.println(origArr[k]);
		}			
	}
}
