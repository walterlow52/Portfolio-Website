package projects;
import java.util.Scanner;

public class grade2 {

	public static void main(String[] args) {
		Scanner keybd = new Scanner(System.in);
		System.out.println("This program converts a number grade into a letter grade.\nEnter a value between 0 to 4");
		double grade = keybd.nextDouble();
		
		if (grade >= 3.75)
			System.out.print("A+");
		else if (grade >= 3.45)
			System.out.print("A-");
		else if (grade >= 3.15)
			System.out.print("B+");
		else if (grade >= 2.85)
			System.out.print("B");
		else if (grade >= 2.45)
			System.out.print("B-");
		else if (grade >= 2.15)
			System.out.print("C+");
		else if (grade >= 1.85)
			System.out.print("C");
		else if (grade >= 1.45)
			System.out.print("C-");
		else if (grade >= 1.15)
			System.out.print("D+");
		else if (grade >= 0.85)
			System.out.print("D");
		else if (grade >= 0.45)
			System.out.print("D-");
		else if (grade == 0)
			System.out.print("F, See you next year");

	}

}
