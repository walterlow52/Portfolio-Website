package projects;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Lab 2- Interest 
 * Computer Programming II (CUS 1116)
 * @author Bronco SSB 
 * 2/14/20 
 * This program will calculate the interest earned over a period of time with an initial 
 * balance, annual rate, and number of years invested.
 */

public class Interest {

	/* declaring variables (using static so these variables can be used
	 * throughout different methods in this program)
	 */
	static double balance;
	static double rate;
	static int years;
	
	//decimal format used to round values into the hundredths place
	static DecimalFormat fmt = new DecimalFormat("0.00"); 

	public static void main(String[] args) {

		printIntro(); //prints introduction message

		Scanner in = new Scanner(System.in);

		System.out.print("Please enter the initial balance: "); //prompt for initial balance
		balance = in.nextDouble();
		System.out.print("Please enter the interest rate (%): "); //prompt for interest rate
		rate = in.nextDouble();
		System.out.print("Please enter the number of years: "); //prompt for time (in years)
		years = in.nextInt();
		System.out.println();

		printTable(years, balance, rate); //prints the table of values

		in.close();

	}

	public static void printIntro() { //informs user about the program computed

		System.out.println("This program will calculate the interest earned over a period of time with an initial balance, annual rate, and number of years invested.");
		System.out.println();

	}

	public static void printTable(int numRows, double balance, double rate) {

		//prints out the table with the header and the values (uses \t for spacing)
		System.out.println("Years\t" + "Balance\t" + "\tInterest\t" + "New Balance");

		for (int i = 1; i <= numRows; i++) {
			printRow(i, balance, rate); //calls from printRow for values
			balance = Interest.balance; //takes newBalance from printRow method
		}

	}

	public static void printRow(int rowNum, double balance, double interest) { //prints each row

		double rate = calculateInterest(balance, interest); //returns interest
		double newBalance = balance + rate; //adds interest to balance
		
		//prints the row using the decimal format
		System.out.println(rowNum + "\t" + fmt.format(balance) + "\t" + "\t" + fmt.format(rate) + "\t" + "\t" + fmt.format(newBalance));
		
		//calls static balance so it can be used for the printTable method
		Interest.balance = newBalance;  

	}

	public static double calculateInterest(double balance, double rate) {

		return (balance * (rate / 100)); //calculates and return interest accumilated

	}

}
