package projects;
/* Walter Low
 * Gradebook project using loops
 */

import java.util.Scanner;

public class gradebookloop {

	public static void main(String[] args) {
		// declare variables
		System.out.println("This program is a gradebook. Follow the steps and find the GPA.");
		Scanner it = new Scanner(System.in);
		double a; // Counter for course 1
		double b; // Counter for course 2
		double c; // Counter for course 3
		double d; // Counter for course 4
		double scoreOne = 0;
		double scoreTwo = 0;
		double scoreThree = 0;
		double scoreFour = 0;
        double scoreOne_gp = 0;
        double scoreTwo_gp = 0;
        double scoreThree_gp = 0;
        double scoreFour_gp = 0;
        String scoreOne_lg = null;
        String scoreTwo_lg = null;
        String scoreThree_lg = null;
        String scoreFour_lg = null;
        
        
      //declare formatter
      String formatter = "%-20s%-20s%-20s%-20s";
		
		//get user input on courses
		System.out.println("Enter the four courses");
		String class_one = it.next(); // Course 1
		String class_two = it.next(); // Course 2
		String class_three = it.next(); // Course 3
		String class_four = it.next(); // Course 4
		
		//get user input on scores using for loops
		System.out.print("Please enter the scores for " + class_one);
		    for (a = 1; a <= 1; a++) {
			scoreOne = (it.nextDouble() + it.nextDouble() + it.nextDouble() ) / 3;
			
			if (scoreOne >= 90)
				scoreOne_gp = 4.0;
			else if (scoreOne >= 80)
				scoreOne_gp = 3.0;
			else if (scoreOne >= 70)
				scoreOne_gp = 2.0;
			else if (scoreOne >= 60)
				scoreOne_gp = 1.0;
			else if (scoreOne < 60)
				scoreOne_gp = 0.0;
			
			if (scoreOne >= 90)
				scoreOne_lg = "A";
			else if (scoreOne >= 80)
				scoreOne_lg = "B";
			else if (scoreOne >= 70)
				scoreOne_lg = "C";
			else if (scoreOne >= 60)
				scoreOne_lg = "D";
			else if (scoreOne < 60)
				scoreOne_lg = "F";
			
		    }
		
		System.out.print("Please enter the scores for " + class_two);
		for (b = 1; b <= 1; b++) {
			scoreTwo = (it.nextDouble() + it.nextDouble() + it.nextDouble() ) / 3;
			
			if (scoreTwo >= 90)
				scoreTwo_gp = 4.0;
			else if (scoreTwo >= 80)
				scoreTwo_gp = 3.0;
			else if (scoreTwo >= 70)
				scoreTwo_gp = 2.0;
			else if (scoreTwo >= 60)
				scoreTwo_gp = 1.0;
			else if (scoreTwo < 60)
				scoreTwo_gp = 0.0;
			
			if (scoreTwo >= 90)
				scoreTwo_lg = "A";
			else if (scoreTwo >= 80)
				scoreTwo_lg = "B";
			else if (scoreTwo >= 70)
				scoreTwo_lg = "C";
			else if (scoreTwo >= 60)
				scoreTwo_lg = "D";
			else if (scoreTwo < 60)
				scoreTwo_lg = "F";
			
		}
		
		System.out.print("Please enter the scores for " + class_three);
		for (c = 1; c <= 1; c++) {
			scoreThree = (it.nextDouble() + it.nextDouble() + it.nextDouble() )/ 3;
			
			
			if (scoreThree >= 90)
				scoreThree_gp = 4.0;
			else if (scoreThree >= 80)
				scoreThree_gp = 3.0;
			else if (scoreThree >= 70)
				scoreThree_gp = 2.0;
			else if (scoreThree >= 60)
				scoreThree_gp = 1.0;
			else if (scoreThree < 60)
				scoreThree_gp = 0.0;
			
			if (scoreThree >= 90)
				scoreThree_lg = "A";
			else if (scoreThree >= 80)
				scoreThree_lg = "B";
			else if (scoreThree >= 70)
				scoreThree_lg = "C";
			else if (scoreThree >= 60)
				scoreThree_lg = "D";
			else if (scoreThree < 60)
				scoreThree_lg = "F";
			
		}
		
		System.out.print("Please enter the scores for " + class_four);
		for (d = 1; d <= 1; d++) {
			scoreFour = (it.nextDouble() + it.nextDouble() + it.nextDouble() ) / 3;
			
			if (scoreFour >= 90)
				scoreFour_gp = 4.0;
			else if (scoreFour >= 80)
				scoreFour_gp = 3.0;
			else if (scoreFour >= 70)
				scoreFour_gp = 2.0;
			else if (scoreFour >= 60)
				scoreFour_gp = 1.0;
			else if (scoreFour < 60)
				scoreFour_gp = 0.0;
			
			if (scoreFour >= 90)
				scoreFour_lg = "A";
			else if (scoreFour >= 80)
				scoreFour_lg = "B";
			else if (scoreFour >= 70)
				scoreFour_lg = "C";
			else if (scoreFour >= 60)
				scoreFour_lg = "D";
			else if (scoreFour < 60)
				scoreFour_lg = "F";
			
		}
			
		//print the grade book
		System.out.printf("%-20s%-14s%-20s%-20s", "Courses", "Average", "Letter Grade", "Grade Points" + "\n");
		System.out.println();
		System.out.printf(formatter, class_one, scoreOne, scoreOne_lg, scoreOne_gp);
		System.out.println();
		System.out.printf(formatter, class_two, scoreTwo, scoreTwo_lg, scoreTwo_gp);
		System.out.println();
		System.out.printf(formatter, class_three, scoreThree, scoreThree_lg, scoreThree_gp);
		System.out.println();
		System.out.printf(formatter, class_four, scoreFour, scoreFour_lg, scoreFour_gp);
		System.out.println();
		
		//print GPA
		double GPA = (scoreOne_gp + scoreTwo_gp + scoreThree_gp + scoreFour_gp) / 4;
		System.out.print("\n" + "GPA = " + GPA);
		
		it.close();
		    
	}
	
}
	

	

	


		

