package defaultpackage;

public class ArraySum {

	public static void main(String[] args) {
		//ARRAY Exercise 1
		//sums the array's value with the following elements
		//25, 4, 16, 9, 10
		//declare array with elements
		int[] arr = {25, 4, 16, 9, 10};
		//initialize sum to 0
		int sum = 0;
		
		System.out.println("The array's values are: 25, 4, 16, 9, & 10");
		
		for (int i = 0; i<arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("The sum of the array's values is: " +sum);

	}

}
