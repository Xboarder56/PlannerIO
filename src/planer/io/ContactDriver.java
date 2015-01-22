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
	private static Contact[] contacts;
	private static int avgAge, totalBusiness, totalPersonal;
	
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
		defaultContactValues();
		
		for(int i=0; i<contacts.length; i++)
		{
			
			System.out.println(contacts[i]);
		}
		System.out.println(" ");
	}
	
	public static void inputTwo()
	{
		defaultContactValues();
		calcAvgAge();
		calContacts();
		
		System.out.println("Number of contacts: " + contacts.length);
		System.out.println("Number of personal contacts: " + totalPersonal);
		System.out.println("Number of personal contacts: " +  totalBusiness);
		System.out.println("Average Contact age: " + avgAge);
		System.out.println(" ");
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
	
	public static void calContacts()
	{
		for(int i=0; i<contacts.length; i++)
		{
			if(contacts[i] instanceof PersonalContact)
			{
				totalPersonal++;
			}
			
			if(contacts[i] instanceof PersonalContact)
			{
				totalBusiness++;
			}
		}
	}
	
	public static void calcAvgAge()
	{
		for(int i=0; i<contacts.length; i++)
		{
			avgAge += contacts[i].getAge();
		}
		
		avgAge = avgAge/contacts.length;
	}
	
	public static void defaultContactValues()
	{
		contacts = new Contact[6];
		
		contacts[0] = new PersonalContact("Joe Smith", 33,"100 Evergreen Ave", "Seattle", "WA", 98999);
		contacts[1] = new PersonalContact("Lawrence Williams", 45, "2000 1st St", "Tacoma", "WA", 98100);
		contacts[2] = new PersonalContact("Rachel Garcia", 12, "12 Forest Drive", "Los Angelos", "CA", 99301);
		contacts[3] = new BusinessContact("Gregory Smith", 67, "360-888-7777", "360-555-6666");
		contacts[4] = new BusinessContact("Jerome Bradley", 18, "216-111-2222", "253-444-7777");
		contacts[5] = new BusinessContact("Susie Adams", 23, "253-333-7777", "425-666-9999");
		
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
