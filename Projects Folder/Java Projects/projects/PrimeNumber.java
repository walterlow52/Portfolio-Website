package projects;
import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, m, flag = 0;
		System.out.println("Enter a number to see if it is a prime number: ");
		int n = in.nextInt();
		m = n/2;
		
		if (n == 0 || n == 1) {
			System.out.println(n + " is not a prime number.");
		}
		else {
			for (i = 2; i <= m; i++) {
				if (n%1 == 0) {
					System.out.println(n + " is not a prime number.");
					flag = 1;
					break;
				}
				if (flag == 0) {
					System.out.println(n + " is a prime number.");
				}
			}
		}
	}

}
