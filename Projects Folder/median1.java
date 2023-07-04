package projects;
import java.util.Scanner;

public class median1 {

	public static void main(String[] args) {

		// declare variables
		Scanner keybd = new Scanner(System.in);
		System.out.println("This program finds the median of a given set of integers.\nPlease enter three values:");
	    int a = keybd.nextInt();
		int b = keybd.nextInt();
	    int c = keybd.nextInt();
	    
		if ((a < b) && (b < c))
		{
		System.out.printf("Median = " + b);
		}
		
		else if ((a > b) && (b > c))
		{
		System.out.printf("Median = " + b);
		}
		
		if ((b > a) && (a > c))
		{
		System.out.print("Median = " + a);
		}
		
		else if ((b > a) && (b > c))
	    {
			System.out.print("Median = " + a);
	    }
		
		if ((a > c) && (c > b))
        {
			System.out.print("Median = " + c);
        }
		
		else if ((a < c) && (c < b))
		{
			System.out.print("Median = " + c);
		}
	}

}
