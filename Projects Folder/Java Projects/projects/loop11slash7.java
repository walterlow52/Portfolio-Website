package projects;

public class loop11slash7 {

	public static void main(String[] args) {
	System.out.println("This program simulates a Christmas scenario where the user gets gifts at an incremental rate.");
	int newGifts = 0;
	int totalGifts = 0;
	System.out.printf("%-10s%10s%15s", "Day", "New Gifts", "Total Gifts");
	System.out.println();
	
	for (int day = 1; day <= 12; day ++)
	{
		newGifts += day;
		totalGifts += newGifts;
		System.out.printf("%-10s%10s%15s", day, newGifts, totalGifts);
		System.out.println();
	}

	}

}
