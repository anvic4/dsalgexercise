package defaultpackage;

import java.util.Stack;

public class StackElements {

	public static void main(String[] args) {
		//STACK Exercise 2
		//Create a stack of strings
		Stack<String> stack = new Stack<String>();
		//print what's inside the stack
		System.out.println("What's inside the stack?");
		//print stack
		System.out.println(stack);
		//print push
		System.out.println("Let's push some elements there:");
		//push three elements onto the stack = Alice, Bob, Charlie
		stack.push("Alice");
		stack.push("Bob");
		stack.push("Charlie");
		//print stack
		System.out.println(stack);
				
		//print pop
		System.out.println("Let's pop the pushed elements:");
		//pops the pushed elements
		//prints the popped elements using system.out.println(observe how LIFO is applied)
		while (!stack.isEmpty()) {
			String popped = stack.pop();
			System.out.println(popped);
		}
		//print new stack
		System.out.println("What's inside the stack now?");
		//print stack
		System.out.println(stack);
		//print true or false
		System.out.println("True or False: The stack is empty again.");
		//checks if the stack is empty (this should return true)
		System.out.println(stack.isEmpty());
				
				
	}

}
