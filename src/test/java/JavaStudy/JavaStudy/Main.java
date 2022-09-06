package JavaStudy.JavaStudy;

public class Main {
	
	public static boolean isElementExist(int [] arr, int key) {
		  for(int i = 0 ; i < arr.length; i++) {
		   if(arr[i] == key)
		    return true;
		 }
		  return false;

		  }

	public static void main(String[] args) {
		int arr[] = {12,35,1,10,34,98};
		   int key = 34;
		   


		   System.out.println(isElementExist(arr,key));
	}
}
