package defaultpackage;

import java.util.LinkedList;

public class LinkyFruits {

	public static void main(String[] args) {
		// LINKEDLIST Exercise 1
		//create a list with the following elements: apple, banana, cherry
		//print the list using println
		//add orange to the beginning of the lsit
		//print the list gain
		//remove an element from the liset
		//print the list again
		//get an element at a specific index
		//print the size of the lsit
		
		LinkedList<String> fruit = new LinkedList<String> ();
		//add elements
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Cherry");
		//print list
		System.out.println("First listing of Fruits: " +fruit);
		//add orange
		fruit.addFirst("Orange");
		//print again
		System.out.println("New list of Fruits: " +fruit);
		//remove an element
		fruit.remove(3);
		//print again
		System.out.println("New list after removing a fruit: " +fruit);
		//get an element at a specific index
		String element = fruit.get(1);
		System.out.println("Element at Index 1: " +element);
		//print size
		int size = fruit.size();
		System.out.print("Size of the list: " +size);
		

	}

}
