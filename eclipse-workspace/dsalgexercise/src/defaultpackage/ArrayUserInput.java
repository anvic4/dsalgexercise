package defaultpackage;

import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) {
		//ARRAY Exercise 3
		//create an array of 5 integers
		//prompts user to enter 5 integer values to fill the array
		//find the sum of all elements
		//print result
		
		int[] arr = new int[5];
		Scanner input = new Scanner(System.in);
		//enter 5 integers
		System.out.println("Enter the five integer values:");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter value "+ (i+1) +": ");
			arr[i] = input.nextInt();
		}
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
	System.out.println("The sum of the array's values is: " +sum);
	}
}
