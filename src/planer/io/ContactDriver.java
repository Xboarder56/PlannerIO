package planer.io;

import java.util.Scanner;
/*
 * 
 */

/**
 * @author Garrett J. Beasley
 *
 */
public class ContactDriver {

	/**
	 * @param args
	 */
	
	private static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		/*Calling the methods into the main method to be run.*/
		intro();
		inputReader();
		
		/*Close the console*/
		console.close();
	}
	
	public static void intro()
	{
		/*User input and selections for the user*/
		System.out.println("Welcome to my planner!");
		System.out.println("1. Print planner contacts.");
		System.out.println("2. Print planner statistics.");
		System.out.println("3. Exit.");
		System.out.println(" ");
		
	}
	
	
	public static void inputOne()
	{
		
	}
	
	public static void inputTwo()
	{
		
	}
	
	/**
	 * Input 3 (when the user hits 3)
	 * @description When 3 is pressed the program will enter
	 * into the inputFour method and tell the user goodbye
	 * then the system will exit the java machine.
	 */
	public static void inputThree()
	{
		/*Goodbye to the user and thank them*/
		System.out.println("Thanks for checking the planer!! :)");
		
		/*Close the java machine*/
		System.exit(0);
	}
	
	public static void inputReader()
	{
		/*Tell the user to pick a selection between 1-4*/
		System.out.println("Please enter a selection: ");
		int selection = console.nextInt(); //clears the prompt (to skip enter key)
		console.nextLine();
		
		/*If user enters 1 enter this section*/
		if(selection == 1)
		{
			/*Go to 1 then loop the code after*/
			inputOne();
			inputReader();
		}
		
		/*If user enters 2 enter this section*/
		else if(selection == 2)
		{
			/*Go to 2 then loop the code after*/
			inputTwo();
			inputReader();
		}
		
		/*If user enters 3 enter this section*/
		else if(selection == 3)
		{
			/*Go to 3 then loop the code after*/
			inputThree();
			inputReader();
		}
		
		/*Anything else other then 1-4 will go down here*/ 
		else
		{
			/*Tell the user to please enter a number between 1-4 and loop the code*/
			System.out.println("Not a valid selection please enter a number between 1-3");
			inputReader();
		}
	}
	

}
