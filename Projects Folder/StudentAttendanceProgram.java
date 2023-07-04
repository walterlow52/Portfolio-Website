package projects;
import java.util.Scanner;

/**
 * @author Bronco SSB
 */

public class StudentAttendanceProgram {

	static Scanner in = new Scanner(System.in);
	static String student_name;
	
	public static void main(String[] args) {
		
		DateMethod();
		
		System.out.println("How many students are in your class?");
		int numofStudents = in.nextInt();
		
		for (int i = 1; i <= numofStudents; i++) {
			System.out.println("Please enter the name of your student?");
			student_name = in.next();
			System.out.println("Was " + student_name + " here today for class?");
			String response = in.next();
			Absentee(response);
			
		}
		
	}
	
	public static void DateMethod() {
		
		System.out.println("Please enter today's date: " + "ex. 11/15/2020");
		String date = in.next();
		System.out.println("\nLet's take the attendance for " + date);
		
	}
	
	public static void Absentee(String response) {
		String message;
		
		if (response.equals("yes")) 
			message = student_name + " was here today.";
		
		else if (response.equals("no"))
			message = student_name + " was absent today.";
		
		else
			message = "ERR";
		
		System.out.println(message);
		
	}
}
