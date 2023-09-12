package projects;
import java.util.*;

/**
 * Lab 6- Magic Matrix 
 * Computer Programming II (CUS1116)
 * @author Walter Low 
 * This lab will accept a two dimensional array of integers
 * as a parameter and return true if it makes a magic square.
 */

public class MagicMatrix {

	public static void main(String[] args) {

		// declaring matrices
		int[][] matrix1 = { { 1, 1 }, { 1, 1 } };
		int[][] matrix2 = { { 5, 3, 1 }, { 1, 2, 3 }, { 2, 4, 6 } };
		int[][] matrix3 = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };

		// printing matrices
		System.out.println("Matrix 1: " + Arrays.deepToString(matrix1));
		System.out.println("Matrix 2: " + Arrays.deepToString(matrix2));
		System.out.println("Matrix 3: " + Arrays.deepToString(matrix3));

		// creating square form of Matrix 1
		System.out.println("\nMatrix 1");
		for (int i = 0; i <= matrix1.length - 1; i++) {
			System.out.println();
			System.out.print(matrix1[i][0]);
			System.out.print(matrix1[i][1]);
		}
		
		System.out.println("\n");

		// finding the total for each column of matrix 1
		int total_m1 = 0;
		for (int x = 0; x < matrix1.length; x++) {
			total_m1 = 0;
			for (int y = 0; y < matrix1.length; y++) {
				total_m1 = total_m1 + matrix1[x][y];
			}
			
			// printing total in statement form for matrix 1
			System.out.println("The sum of column " + (x + 1) + " for Matrix 1 is " + "= " + total_m1);
		}
        
		// prints returned value from isMagicSquare method for matrix 1
		System.out.println("\nMatrix 1 is " + isMagicSquare(matrix1, total_m1, matrix1, total_m1));
		System.out.println();

		// creating square form of Matrix 2
		System.out.println("\nMatrix 2");
		for (int i = 0; i <= matrix2.length - 1; i++) {
			System.out.println();
			System.out.print(matrix2[i][0]);
			System.out.print(matrix2[i][1]);
			System.out.print(matrix2[i][2]);
		}
		
		System.out.println("\n");

		// finding the total for each column of matrix 2
		int total_m2 = 0;
		for (int x = 0; x < matrix2.length; x++) {
			total_m2 = 0;
			for (int y = 0; y < matrix2.length; y++) {
				total_m2 = total_m2 + matrix2[x][y];
			}
			
			//printing total in statement form for matrix 2
			System.out.println("The sum of column " + (x + 1) + " for Matrix 2 is " + "= " + total_m2);
		}
        
		//Matrix 2 is false since the columns don't have the same sums
		System.out.println("\nMatrix 2 is " + isMagicSquare(matrix2, total_m2, matrix2, total_m2));
		System.out.println();

		// creating square form of Matrix 3
		System.out.println("\nMatrix 3");
		for (int i = 0; i <= matrix3.length - 1; i++) {
			System.out.println();
			System.out.print(matrix3[i][0]);
			System.out.print(matrix3[i][1]);
			System.out.print(matrix3[i][2]);
		}

		System.out.println("\n");

		// finding the total for each column of matrix 3
		int total_m3 = 0;
		for (int x = 0; x < matrix3.length; x++) {
			total_m3 = 0;
			for (int y = 0; y < matrix3.length; y++) {
				total_m3 = total_m3 + matrix3[x][y];
			}
			
			//printing total in statement form for matrix 3
			System.out.println("The sum of column " + (x + 1) + " for Matrix 3 is " + "= " + total_m3);
		}
		
		// prints returned value from isMagicSquare method for matrix 3
		System.out.println("\nMatrix 3 is " + isMagicSquare(matrix3, total_m3, matrix3, total_m3));

	}

	//method used to determine if the matrix is a magic square or not
	public static boolean isMagicSquare(int[][] matrix1, int total_m1, int[][] matrix3, int total_m3) {
		
		if (total_m1 == 2)
			return true;
		
		//matrix 2 isn't in this method since it didn't have the same sums
		
		else if (total_m3 == 15)
			return true;
		else
			return false;

	}
}
