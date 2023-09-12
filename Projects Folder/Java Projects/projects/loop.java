package projects;
import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		// initiate variables
		double balance = 500;
		double monthly = 0.02/12; //2% annual interest rate
		double deposit = 40;
		double interest;
		double goal = 2500; //amount needed for car
		int months = 0;
		String formatter = "%5d%15.2f%12.2f%12.2f";
		System.out.printf("%8s%15s%11s%11s", "Month", "Interest", "Deposit", "Balance");
		System.out.println();
		
		while (balance < goal)
		{   months++;
		    interest = balance*monthly;
		    balance += interest;
		    balance += deposit;
		System.out.printf(formatter, months, interest, deposit, balance);
		System.out.println();
		    

	}

}
}