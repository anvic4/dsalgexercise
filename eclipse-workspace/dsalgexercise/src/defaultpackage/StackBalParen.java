package defaultpackage;

import java.util.Stack;

public class StackBalParen {
	//STACK Exercise 1
	//check if a string of parentheses is balanced
	//output should be true or false
	public static boolean Balanced(String parentheses){
		//create a stack
		Stack<Character> stack = new Stack<Character>();
		
		for (int i=0; i<parentheses.length(); i++) {
			char p = parentheses.charAt(i);
			//if open parenthesis, push to stack
			if (p=='(') {
				stack.push(p);
			}
			//if close parenthesis, check if stack is empty, or there's an open paren in the stack already
			else if (p==')') {
				if (stack.isEmpty()||stack.peek() != '(') {
					return false;
				}
				else {
					stack.pop();
				}
			}
		}
		//if stack is empty
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		//parentheses examples
		String parentheses1 = "((()))";
		String parentheses2 = "()()";
		String parentheses3 = "(";
		String parentheses4 = ")";
		
		System.out.println("Balanced Parentheses? (true or false)");
		
		//check if each paren examples is balanced
		//print result: true or false
		System.out.println("Parentheses 1: '((()))'");
		System.out.println(Balanced(parentheses1));
		System.out.println("Parentheses 2: '()()'");
		System.out.println(Balanced(parentheses2));
		System.out.println("Parentheses 3: '('");
		System.out.println(Balanced(parentheses3));
		System.out.println("Parentheses 4: ')'");
		System.out.println(Balanced(parentheses4));
	}
		
}