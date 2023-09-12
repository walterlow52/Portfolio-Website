package projects;
import java.util.*;

public class MultiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// To declare a two-dimensional array
		int[][] matrix = new int[20][15];
		
		int[] myBoard0 = {23, 5, 6, 15, 18 };
		System.out.println(Arrays.toString(myBoard0));

		// To initialize a two-dimensional array when it is declared:
		int[][] myBoard = { { 23, 5, 6, 15, 18 }, { 4, 16, 24, 67, 10 }, { 12, 54, 23, 76, 11 }, { 1, 12, 34, 22, 8 },
				{ 81, 54, 32, 67, 33 }, { 12, 34, 76, 78, 9 } };
		
		
		// number of rows
		System.out.println(matrix.length);
		// number of columns
		System.out.println(matrix[0].length);

		// To print the first column
		for (int i = 0; i <= myBoard.length - 1; i++) {
			System.out.println(myBoard[i][0]);
		}

		// To print a two-dimensional array
		System.out.println(Arrays.deepToString(myBoard));

		// three-dimensional array
		int[][][] threeDBoard = { { { 1, 2 }, { 3, 4 }, { 5, 6 } }, { { 10, 20 }, { 30, 40 }, { 50, 60 } } };

		System.out.println(Arrays.deepToString(threeDBoard));

		// deep copy vs shallow copy
		int[] myArray = { 23, 4, 65, 8, 31 };
		int[] firstCopy = new int[5];
		int[] secondCopy = myArray.clone();
		int[] thirdCopy = new int[4];

		//shallow copy
		firstCopy = myArray;
		//deep copy
		thirdCopy = myArray.clone();

		myArray[0] = 1000;

		System.out.println("----------------------");
		System.out.println(Arrays.toString(myArray));
		System.out.println(Arrays.toString(firstCopy));
		
		
		System.out.println(Arrays.toString(secondCopy));
		System.out.println(Arrays.toString(thirdCopy));

		// TWO-DIMENSIONAL ARRAYS: SPECIAL CASES
		// arrays with different pattern
		int[][] board;
		board = new int[5][]; // Create the number of rows
		board[0] = new int[6];
		board[1] = new int[2];
		board[2] = new int[5];
		board[3] = new int[3];
		board[4] = new int[4];

		// Sum of each individual column in matrix with fixed number of rows and columns
		int sum;
		for (int col = 0; col < myBoard[0].length; col++) {
			sum = 0;
			for (int row = 0; row < myBoard.length; row++)
				sum = sum + myBoard[row][col];

			System.out.println("The sum of the elements of column " + (col + 1) + " = " + sum);
		}

	}

}
