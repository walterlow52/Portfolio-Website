package projects;
import java.util.Scanner;

/**
 * @author Walter Low
 * Exercise Chapter 4
 */
public class exercise41 {

	public static void main(String[] args) {
		// Exercise 4.1a
		int sum = 0;
		for (int x = 2; x <= 100; x+=2)
		{sum += x;}
		System.out.println("The total is " + sum);
		
		//exercise 4.1c with power of two
		int power2 = 1;
		for (int x = 1; x <= 20; x++)
		{power2 *= 2;
		System.out.println("2^" + x + "= " + power2);
		}
		
		//Exercise 4.2a find min and max from input
		Scanner emp = new Scanner(System.in);
		System.out.println("Enter a number or Q to quit");
		int min, max;
		int x;
		min = max = emp.nextInt();
		
		while (emp.hasNextInt())
		{
			x = emp.nextInt();
			if (x < min)
				min = x;
			else if (x > max)
			    max = x;
			System.out.println("Enter a number or Q to quit");
			
		}
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);

	}

}
