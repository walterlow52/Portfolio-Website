package projects;
import java.util.Scanner;

public class peterm {

	public static void main(String[] args) {
		//declare variables
		Scanner input = new Scanner(System.in);
		int days = 0;
		int target= 30;
		double compound = 0;
		double initial = 0.01;
		double rate = 2;
		String format = "%-10s%10.2f";
		String format_two = "%-15s";
		double compound_total = 0;
		
		//print first line
		System.out.printf(format_two, "Day");
		System.out.print("Balance");
		System.out.println();
		
		//initiate loop
		while ((days <= target) && (initial <= target))
		{
			days++;
			initial++;
			compound = Math.pow(rate, days) / rate / 100;
			compound_total = compound + compound;
			System.out.printf(format, days, compound);
			System.out.println();
			
		}
			
		//enter 30 day value in sentence
		System.out.println("By the 30th day, I will put $" + compound + " in my piggy bank.");
		
		//enter sum of value
		System.out.print("In 30 days, there will be a total balance of $" + compound_total + " in my piggy bank.");
		
			
		input.close();
			

    }
}