package projects;

import java.util.Scanner;

public class loopex {

	public static void main(String[] args) {
		// declare variables
		Scanner keybd = new Scanner(System.in);
		System.out.println("This program finds the average for a given amount of test scores.\n Please enter the amount of scores to be inputted.");
		int numScores = keybd.nextInt();
		int count = 0;
		int score;
		int sum = 0;
		
		while (count < numScores)
		{ System.out.println("Enter a score");
		score = keybd.nextInt();
		sum += score;
		count++;
		}
		
		System.out.println("The sum is " + sum);
		System.out.println("There were " + count + " scores.");
		System.out.println("The average is " + sum/count);

	}

}
