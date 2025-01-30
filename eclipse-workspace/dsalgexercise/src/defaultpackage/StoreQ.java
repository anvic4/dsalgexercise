package defaultpackage;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StoreQ {

	public static void main(String[] args) {
		//QUEUE Exercise 1
		//create a queue
		Queue<String> line = new LinkedList<>();
				
		//scanner for user input
		Scanner scanner = new Scanner(System.in);
				
		//initialize a boolean flag to control the loop
		boolean done = false;
				
		//start a loop that continues until the user exits
		while (!done) {
			//prompt the user to enter a command
			System.out.println("Enter a command: (Join, Serve, Exit)");
			String command = scanner.nextLine();
					
			//use a switch statement to handle different commands
			switch (command) {
				case "join":
					//prompt the user to enter their name
					System.out.println("Enter your name: ");
					String name = scanner.nextLine();
						
					//add the user's name to the end of the line
					line.add(name);
						
					//print a message indicating the user has joined the line
					System.out.println(name + " has joined the line.");
					break;
				case "Join":
					//prompt the user to enter their name
					System.out.println("Enter your name: ");
					String Name = scanner.nextLine();
						
					//add the user's name to the end of the line
					line.add(Name);
						
					//print a message indicating the user has joined the line
					System.out.println(Name + " has joined the line.");
					break;	
				case "serve":
					//chcek if the line is empty
					if (line.isEmpty()) {
						System.out.println("No one is in the line.");
					}
					else {
						//serve the next customer in the line
						String next = line.remove();
							
						//print a message indicating the next customer has been served
						System.out.println(next + " has been served.");
					}
					break;
				case "Serve":
					//chcek if the line is empty
					if (line.isEmpty()) {
						System.out.println("No one is in the line.");
					}
					else {
						//serve the next customer in the line
						String next = line.remove();
						
						//print a message indicating the next customer has been served
						System.out.println(next + " has been served.");
					}
					break;		
				case "exit":
						//print a message indicating the program is exiting
						System.out.println("Exiting program.");
						//set the done flag to true to exit the loop
						done = true;
						break;
				case "Exit":
					//print a message indicating the program is exiting
					System.out.println("Exiting program.");
					//set the done flag to true to exit the loop
					done = true;
					break;
					default:
						//print message if an invalid command was entered
						System.out.println("Invalid command.");
						}
				}
			}

		}
