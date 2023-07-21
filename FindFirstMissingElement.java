package week1.day2;

/// Here is the input


// Sort the array	


// loop through the array (start i from arr[0] till the length of the array)

	// check if the iterator variable is not equal to the array values respectively
	
		// print the number
		
		// once printed break the iteration
		
		//
public class FindFirstMissingElement {
	
	public void missingElement(int[] array) {
		
		for(int i=0; i<array.length;i++) {
			
			if (array[i] != (i+1)) {
				System.out.println(i+1);
				break;
			}
			
		}
		
		
	}
	

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		FindFirstMissingElement element = new FindFirstMissingElement();
		element.missingElement(arr);
	}

}
