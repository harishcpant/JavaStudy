package DataStructure;

public class BinarySearch {

	public static void main(String[] args) {
		int origArr[] = {10,20,30,40,50};  
		int searchKey=30;
		int firstIndex=0;
		int lastIndex=origArr.length-1;

		int midIndex=(firstIndex+lastIndex)/2;
		System.out.println("origional firstIndex-->"+firstIndex);
		System.out.println("origional midIndex-->"+midIndex);
		System.out.println("origional lastIndex-->"+lastIndex);
		
		while(firstIndex<=lastIndex) {
			if(searchKey==origArr[midIndex]) {
				System.out.println("Element is found at index: " + midIndex);
				break;
			}
			else if (searchKey>origArr[midIndex]) {
				firstIndex=midIndex+1; // firstIndex=3
				System.out.println("New firstIndex-->"+firstIndex);
			}
			
			midIndex=(firstIndex+lastIndex)/2; //
			System.out.println("New midIndex-->"+midIndex);
		}
	}

}
