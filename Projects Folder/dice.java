package projects;

public class dice {

	public static void main(String[] args) {
		//This program simulates a randomized double dice roll and rolls again if the user gets a double.
		
		for (int i = 1; i <= 1; i++) {
			int d1 = (int) (Math.random () * 6) + 1;
			int d2 = (int) (Math.random () * 6) + 1;
			int d3 = (int) (Math.random () * 6) + 1;
			int d4 = (int) (Math.random () * 6) + 1;
			int d5 = (int) (Math.random () * 6) + 1;
			int d6 = (int) (Math.random () * 6) + 1;
			System.out.println(d1 + " " + d2);
			System.out.println();
			
			if (d1 == d2) 
				System.out.println(d3 + " " + d4 + "\n");
			else 
				break;
			
			if (d3 == d4)
				System.out.println(d5 + " " + d6);
			else 
				break;
			
			if (d5 == d6)
				System.out.println("Jail");
			else 
				break;
			
			
				
			
		}
		
		

	}

}
