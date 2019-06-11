import java.util.Scanner;    // Needed for the Scanner class

/**
 Input Name, Hours Worked, Wage. Return Gross Pay. This program is intended to be an exercise to practice using the Scanner Class
*/

public class Payroll
{
	public static void main(String[] args)
	{
		// Initialize Variables
		String name;		// Hold Name
		int hours;			// Hours Worked
		double payRate;		// Hourly Pay Rate
		double grossPay;	// Calculated Gross Pay

		// Create Scanner Object
		Scanner keyboard = new Scanner(System.in);

		// Get the User's Name
		System.out.print("What is your Name? ");
		name = keyboard.nextLine();

		// Get Total Hours Worked This Week
		System.out.print("How Many Hours Did You Work This Week? ");
		hours = keyboard.nextInt();

		// Get the User's Hourly Pay Rate
		System.out.print("What is Your Hourly Pay Rate? ");
		payRate = keyboard.nextDouble();

		// Calculate Gross Pay
		grossPay = hours * payRate;

		// Display Resulting Information
		System.out.println("Hello " + name + "!");
		System.out.println("Your Gross Pay is: $" + grossPay);
	}

}