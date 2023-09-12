package projects;
/*
 * Exercise 2.5
 * Sum = 45
 * Difference = -5
 * Product = 500
 * Average = 22.50
 * Distance = 5
 * Maximum = 25 
 * Minimum = 20
 */
import java.util.Scanner;
public class project242 {
	
	public static void main(String[] args) {
		//declare variables
		int x, y;
		Scanner keybd = new Scanner(System.in);
		
		//integer values
		System.out.println("This program takes two integers and applies the basic mathematical functions to them.\nPlease enter two integers: ");
		x = keybd.nextInt();
		y = keybd.nextInt();
		
		//Find answers
		int sum = x + y;
		System.out.printf("Sum: %29d\n", sum);
		
		int difference = x - y;
		System.out.printf("Difference: %21d\n", difference);
		
		int product = x * y;
		System.out.printf("Product: %25d\n", product);
		
		int average = x + y / 2;
		System.out.printf("Average: %25d\n", average);
		
		int distance = Math.abs(difference);
		System.out.printf("Distance: %23d\n", distance);
		
		int maximum = Math.max(x, y);
		System.out.printf("Maximum:  %24d\n", maximum);
		
		int minimum = Math.min(x, y);
		System.out.printf("Minimum: %25d\n", minimum);
		
		
		
	
	}
	
}
