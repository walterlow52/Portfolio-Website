package projects;
import java.util.Scanner;

public class inclass10 {

	public static void main(String[] args) {
		// declare variables
		Scanner keybd = new Scanner(System.in);
		System.out.println("This program analyzes if a given integer is positive, negative, or a zero number.\nEnter an integer: ");
		int integer = keybd.nextInt();
				
		if (integer > 0)
		System.out.print("positive");
		
		else if (integer == 0)
		System.out.print("zero");
		
		else if (integer < 0)
		System.out.print("negative");

	}

}
