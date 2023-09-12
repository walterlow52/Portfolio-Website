package projects;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Bronco SSB
 *
 */
public class Login_System {

	static Scanner andygay = new Scanner(System.in);
	static ArrayList <String> db_username = new ArrayList <String> ();
	static ArrayList <String> db_password = new ArrayList <String> ();
	static String username;
	static String password;
	static String verify_password;
	static int i;
	
	public static void main(String[] args) {

		System.out.println("Login or Register (enter below)");
		String action = andygay.next();
		

		if (action.equals("Login")) {
			System.out.println("Please enter your username and password:");
			Login();
			
		}
			
		else if (action.equals("Register")) {
			System.out.println("Would you like to register an account with us?");
			String response = andygay.next();
			
			if (response.equals("yes")) {
				Register();
			}
				
			else if (response.equals("no")) {
				System.out.println("OK Have a good day!");
			}
		}
		
		else
			System.out.println("Error 404");
					
	}
	
	private static void Register() {
		System.out.println();
		System.out.println("Please enter a user name:");
		username = andygay.next();
		System.out.println("UserName: " + username);
		
		
		System.out.println("Please enter a secure password:");
		password = andygay.next();
		System.out.println("Please confirm your password below:");
		verify_password = andygay.next();
		
		for (i = 0; i <= 5; i++) {
		if (passwordVerification() == true) {
			System.out.println("Congratulations! You have created an account with us. We hope you enjoy our service and we look forward to servicing you.");
			db_username.add(i,username);
			db_password.add(i,password);
			Login();
			break;
		}
		else
			System.out.println("Your username or password is incorrect. Please try again.");
		
		
		}
		
	}
	
	private static void Login() {
		
		for (i = 0; i <= 5; i++) {
		 System.out.println("Please enter your user name:");
		 username = andygay.next();
		 System.out.println("Please enter your password:");
		 password = andygay.next();
		 
			 if ((username.equals(db_username)) && (password.equals(db_password))) {
				 System.out.println("Welcome! You may access the program.");
				 break;
			 }
			 else 
				 System.out.println("Invalid username/password! Please try again.");
			 
		 }
	}
	
	private static boolean passwordVerification() {
		if (password.equals(verify_password)) 
			return true;
		else 
			return false;
				
	}
	
	
}
