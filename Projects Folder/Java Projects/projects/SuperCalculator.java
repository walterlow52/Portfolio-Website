package projects;
import java.util.Scanner;

public class SuperCalculator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("What operation would you like to use the super calculator for?");
		System.out.println("1 - addition");
		System.out.println("2 - subtraction"); 
		System.out.println("3 - multiplication");
		System.out.println("4 - division");
		System.out.println("5 - PEMDAS");
		System.out.println("6 - Area of a square");
		System.out.println("7 - Area of a rectangle");
		System.out.println("8 - Area of a triangle");
		System.out.println("9 - Area of a parrallelogram");
		System.out.println("10 - Area of a trapezoid");
		System.out.println("11 - Area of a rhombus");
		System.out.println("12 - Area of a circle");
		System.out.println("13 - Distance Formula");
		System.out.println("14 - Quadratic Formula");
		System.out.println("15 - Find x in equation");
		System.out.println("16 - Factoring");
		System.out.println("17 - Function Notation");
		System.out.println("18 - Composite Functions");
		System.out.println("19 - Limits");
		System.out.println("20 - Derivatives");
		System.out.println("21 - Sigma Notation");
		System.out.println("22 - Descartes Rule");
		System.out.println("23 - Integrals");
		System.out.println("24 - Chain Rule");
		System.out.println("25 - Area under the curve");
		System.out.println();
		System.out.print("Operation: ");
		int operation = in.nextInt();
		
		if (operation == 1) {
			System.out.println("How many numbers would you like to add?");
			int quantity = in.nextInt();
			for (int i = 0; i <= quantity - 1; i++) {
				int sum = i + i;
				System.out.println(sum);
			}
		}
			
		if (operation == 2) {
			System.out.println("How many numbers would you like to subtract? (enter the numbers subtracted in order)");
		    int quantity2 = in.nextInt();
		    for (int i = 0; i <= quantity2 - 1; i++) {
		    	int difference = i - i;
		    	System.out.println(difference);
		    }
		    
		}
		
		if (operation == 3) {
			System.out.println("How many numbers would you like to multiply?");
			int quantity3 = in.nextInt();
			for (int i = 0; i <= quantity3; i++) {
				int product = i * i;
				System.out.println(product);
			}
		}
		
		if (operation == 4) {
			System.out.println("How many numbers would you like to divide? (enter the numbers divided in order)");
			int quantity4 = in.nextInt();
			for (int i = 0; i <= quantity4; i++) {
				int quotient = i / i;
				System.out.println(quotient);
			}
		}

		if (operation == 5) { //E
			System.out.println("Please enter the PEMDAS equation:");
			
		}
		
		if (operation == 6) {
			System.out.println("Please enter the side for the square to find the area:");
			double sides = in.nextDouble();
			double area_of_square = Math.pow(sides, 2);
			System.out.println(area_of_square);
		}
		
		if (operation == 7) {
			System.out.println("Please enter the length: ");
			double length = in.nextDouble();
			System.out.println("Please enter the width: ");
			double width = in.nextDouble();
			System.out.print("Please enter the height: ");
			double height = in.nextDouble();
			double area_of_rectangle = length * width * height;
			System.out.println(area_of_rectangle);
		}
		
		if (operation == 8) {
			System.out.println("Please enter the base: ");
			double base = in.nextDouble();
			System.out.println("Please enter the height: ");
			double height = in.nextDouble();
			double area_of_triangle = (1/2)*base*height;
			System.out.println(area_of_triangle);
		}
		
		if (operation == 9) {
			System.out.println("Please enter the base: ");
			double base = in.nextDouble();
			System.out.println("Please enter the height: ");
			double height = in.nextDouble();
			double area_of_parallelogram = base * height;
			System.out.println(area_of_parallelogram);
		}
		
		if (operation == 10) {
			System.out.println("Please enter the 1st base: ");
			double base1 = in.nextDouble();
			System.out.println("Please enter the 2nd base: ");
			double base2 = in.nextDouble();
			System.out.println("Please enter the height: ");
			double height = in.nextDouble();
			double area_of_trapezoid = (base1 + base2)/2 * height;
			System.out.println(area_of_trapezoid);
		}
		
		if (operation == 11) {
			System.out.println("Please enter the p diagonal: ");
			double p = in.nextDouble();
			System.out.println("Please enter the q diagonal: ");
			double q = in.nextDouble();
			double area_of_rhombus = p * q / 2;
			System.out.println(area_of_rhombus);
		}
		
		if (operation == 12) {
			System.out.println("Will use radius or circumference?");
			String circle_rc = in.next();
			
			if (circle_rc.equals("radius")) {
			    System.out.println("Please enter the radius: ");
			    double radius = in.nextDouble();
			    double area_of_circle = 3.14 * Math.pow(radius, 2);
			    System.out.println(area_of_circle);
		}
			else if (circle_rc.equals("circumference")) {
				System.out.println("Please enter the circumference: ");
				double circumference = in.nextDouble();
				double area_of_circle = 3.14 * circumference;
				System.out.println(area_of_circle);
			}
			
			else {
				System.out.println("ERROR: type mismatch (restart the program and try again; type radius or circumference exactly found (program is case sensitive))");
			}
		}
		
		if (operation == 14) { //E
			System.out.println("Enter a: ");
			double a = in.nextDouble(); 
			System.out.println("Enter b: ");
			double b = in.nextDouble();
			System.out.println("Enter c:");
			double c = in.nextDouble();
			double sqrt = b * b - 4 * a * c;
			double x_plus = (-b + Math.pow(sqrt, 2)) / (2 * a);
			double x_minus = (-b - Math.pow(sqrt, 2)) / (2 * a);
			System.out.println(x_plus + "   " + x_minus);
		}
		
		if (operation == 15) { //E
			System.out.println("Enter the equation that contains \"x\"");
			
		}
		
		if (operation == 16) { //E
			System.out.println("Enter the two equations that will be factored");	
			
		}
		
		if (operation == 17) { //E
			System.out.println("Please enter the function: ");
			long function = in.nextLong();
			System.out.println("Please enter the x value: ");
			double x = in.nextDouble();
			double answer_of_function = function + x;
		}
		
	}

}
