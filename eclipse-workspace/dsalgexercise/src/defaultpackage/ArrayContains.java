package defaultpackage;

public class ArrayContains {

	public static void main(String[] args) {
		// ARRAY Exercise 2
		//test if an array contains a specific value
		//create an array with five elements
		//declare array
		int[] arr = {25, 4, 27, 6, 21};
		int valueToCheck = 27;
		boolean containsValue = false;
		//print array
		//System.out.println("The array's five elements can be found from 0 to 30.");
		
		
		for (int i = 0; i<arr.length; i++) {
			if(arr[i] == valueToCheck) {
				containsValue =true;
				break;
			}
		}
		if (containsValue) {
			System.out.println("The array contains the value "+valueToCheck);
		}
		else {
			System.out.println("The array does not contain the value "+valueToCheck);
		}

	}

}
