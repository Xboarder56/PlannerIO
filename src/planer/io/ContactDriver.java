/*
 * Garrett J. Beasley
 * 01/21/2015
 * ContactDriver.java
 */

/**
 * @author Garrett J. Beasley
 * @date 01/21/2015
 * @description The program is a simple program that will allow
 * the user to display the contacts and data about there contacts
 * in a user's planner.
 */

/*Package for the project (planer.io)*/
package planer.io;

/*Imports for the project*/
import java.util.Scanner;

/**This is the MAIN Class for the program to be launched from.
 * The program consists of 3 options for the user to select
 * 1. Display contacts, 2. Contact data, 3. Exit
 * Once the option is selected the user then completes the program
 * and will have a option to enter the other menu options once again. 
 */

public class ContactDriver 
{

	
	/*Variables for the program.*/
	private static final Scanner console = new Scanner(System.in);
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
	
	/**Intro UI for the program
	 * @description This basically is the console ui for the program allowing
	 * the user to select 1-3 and then the program will enter into that mode.
	 *  */
	public static void intro()
	{
		/*User input and selections for the user*/
		System.out.println("Welcome to my planner!");
		System.out.println("1. Print planner contacts.");
		System.out.println("2. Print planner statistics.");
		System.out.println("3. Exit.");
		System.out.println(" ");
		
	}
	
	/**
	 * Input One (when the user hits 1)
	 * @description When 1 is pressed the program will enter
	 * into the inputOne method and print out the contacts in the array
	 */
	public static void inputOne()
	{
		defaultContactValues();
		
		for(int i=0; i<contacts.length; i++)
		{
			
			System.out.println(contacts[i]);
		}
		System.out.println(" ");
	}
	
	/**
	 * Input Two (when the user hits 2)
	 * @description When 2 is pressed the program will enter
	 * into the inputTwo method and calculate the data based
	 * upon the array that is preprogrammed into the program
	 * it will print out, total contacts, personal contact#, 
	 * business contact#, average contact age
	 */
	public static void inputTwo()
	{
		/*Calls the methods for the data to be printed out.*/
		defaultContactValues();
		calcAvgAge();
		calContacts();
		
		/*Prints out the data about the contacts for the user*/
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
	
	/**
	 * Calculates the contacts and stores them in variables
	 * weather they are business or personal
	 */
	public static void calContacts()
	{
		/*Loop to go to the total number of contacts in the array 0,1,2,3,4,5*/
		for(int i=0; i<contacts.length; i++)
		{
			/*If the contact is a personal contact enter*/
			if(contacts[i] instanceof PersonalContact)
			{
				/*+1 to the totalPersonal variable.*/
				totalPersonal++;
			}
			/*If the contact is a business contact enter*/
			if(contacts[i] instanceof BusinessContact)
			{
				/*+1 to the totalBusiness variable.*/
				totalBusiness++;
			}
		}
	}
	
	/**
	 * Method to calc the average from the contact array.
	 */
	public static void calcAvgAge()
	{
		for(int i=0; i<contacts.length; i++)
		{
			avgAge += contacts[i].getAge();
		}
		
		/*Sets the total contact value found from the getAge in the loop
		 * divided by the contact length finding the average
		 * thus storing it in the variable avgAge.*/
		avgAge = avgAge/contacts.length;
	}
	
	/**
	 * Preprogrammed data for the contacts
	 * set by the teacher for the project
	 */
	public static void defaultContactValues()
	{
		/*Contacts array set to 6 contacts*/
		contacts = new Contact[6];
		
		/*Preprogrammed data for the contacts in the planer*/
		contacts[0] = new PersonalContact("Joe Smith", 33,"100 Evergreen Ave", "Seattle", "WA", 98999);
		contacts[1] = new PersonalContact("Lawrence Williams", 45, "2000 1st St", "Tacoma", "WA", 98100);
		contacts[2] = new PersonalContact("Rachel Garcia", 12, "12 Forest Drive", "Los Angelos", "CA", 99301);
		contacts[3] = new BusinessContact("Gregory Smith", 67, "360-888-7777", "360-555-6666");
		contacts[4] = new BusinessContact("Jerome Bradley", 18, "216-111-2222", "253-444-7777");
		contacts[5] = new BusinessContact("Susie Adams", 23, "253-333-7777", "425-666-9999");
		
	}
	/**
	 * This will read what the user inputs under the UI
	 * @description: This will read the users input from the UI then
	 * there selected decision will be placed into a variable between 1-3
	 * and compared to the programmed selections 1. Display contacts, 2. Contact info
	 * 3. Exit
	 */
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
