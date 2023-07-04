package projects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CustomerRewardSystemv2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ArrayList <String> customers = new ArrayList <String> ();
		ArrayList <Double> purchases = new ArrayList <Double> ();
		
		System.out.println("This program will give each customer who spent over $50 in purchases a $10 discount on their next purchase.");
		System.out.println("How many customers purchased goods from us today?");
		int numOfCustomers = in.nextInt();
		
		for (int i = 0; i <= numOfCustomers - 1; i++) {
			System.out.println("Enter a customer name: ");
			String name = in.next();
			customers.add(i, name);
			System.out.println("How much did " + name + " spend today?");
			double spend = in.nextDouble();
			purchases.add(i, spend);
			
			if (spend >= 50) {
				System.out.println(name + " will recieve a $10 discount.");
			}
			else {
				System.out.println(name + " will not recieve the $10 discount.");
			}
		}

		System.out.println();
		System.out.println(customers);
		System.out.println(purchases);
		System.out.println();
		
		System.out.println(TopCustomer(customers, purchases));
		
		in.close();

	}

	public static String TopCustomer(ArrayList <String> customers, ArrayList <Double> purchases) {
		
		Object x = Collections.max(purchases);
		int xx = purchases.indexOf(x);
		String topCustomer = (String) customers.get(xx);
		
		String line1 = "OUR TOP CUSTOMER IS: ";
		String line2 = "\n------------------------------------------------";
		String line3 = "\n" + topCustomer.toUpperCase() + "!!!!!!";
		return line1 + line2 + line3;
		
	}
}
