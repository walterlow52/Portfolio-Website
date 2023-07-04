package projects;
import java.util.Scanner;

public class inclass102 {

	public static void main(String[] args) {
		// declare variables
		Scanner keybd = new Scanner(System.in);
		System.out.println("This program determines whether a given set of integers are in numerical order.\nPlease enter three integers");
		int a = keybd.nextInt();
		int b = keybd.nextInt();
		int c = keybd.nextInt();
		
		
		if ((c > b) && (b > a))
		System.out.print("in order");
		
		else if ((a < b) && (b < c))
		System.out.print("in order");
		
		else {
		System.out.print("not in order");
		}
	}

}
