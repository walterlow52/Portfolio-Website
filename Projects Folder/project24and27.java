package projects;
import java.util.Scanner;

public class project24and27 {
	
	public static void main(String[] args) {
		// Ten-digit phone number
		Scanner keybd = new Scanner(System.in);
		System.out.print("This program applies formatting to phone numbers.\nEnter a 10-digit phone number (ex. 1234567890): ");
	     String number = keybd.next();

         String firstThree = number.substring(0, 3);
         String secondThree = number.substring(3, 6);
         String lastThree = number.substring(6);


System.out.printf("Telephone number is: (%s) %s-%s", firstThree, secondThree, lastThree);
		

	}

}
