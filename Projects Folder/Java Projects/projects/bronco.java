package projects;
/* This program will only be used for learning purposes or for Bronco SSB's enjoyment.
 * This program is not school related and will not be graded. Any objections in the 
 * comments will result in me losing my shit.
 */
import java.util.Scanner;

public class bronco {

	public static void main(String[] args) {
		/* This project will be a program that will be about the life of Bronco SSB
		 * using the fundamentals of what I've learned in computer programming. The 
		 * Golden Years of Bronco SSB will be symbolized through this program. But how 
		 * you may ask? Watch and see.
		 */
		Scanner keybd = new Scanner(System.in); 
		System.out.print("Bronco SSB: Golden Years \n -Freshman Year \n");
		System.out.print("Enter code number below");
		int freshman = keybd.nextInt();
		
		if (freshman == 2016)
		{
			
		System.out.println("It all started in Florida where I began my first high school year at Cypress Creek High School.");
		System.out.print("I got a taste of IT when I had an intro to IT class and at the same time, I was playing on the football team." );
		System.out.println("Everything was good until I moved to New York almost at the end of my freshman year in April. \n" + 
		"I moved to New York and I had to make friends from scratch in 2 months before the year ended");
		/*It was difficult to adjust in academic and personal changes once I moved in 
		 * New York but ultimately, I managed and I made some friends before the start
		 * of sophomore year aka my first full year in New York.
		 */
		
		System.out.println("\nSophomore Year -" + "Enter second code below");
		int sophomore = keybd.nextInt();
		
		if (sophomore == 2017)
		{
		System.out.print("Now we're in sophomore year where I was learning my new classes until October where I suffered a fatal blood clot in my brain \nand left me out of school for a month.");
		/* It was devastating but I managed to get through it and I went back to school 
		 * in mid November and everything was going well. I got back to work without
		 * losing a step and everyone welcomed me back.
		 * By the way, how many bits are in a byte?
		 */
		}
		System.out.println("\n\nAnswer the question");
		int Byte = keybd.nextInt();
		
		if (Byte == 8)
		{
		System.out.println("Good you found the answer! I learned this in sophomore engineering. Told you I didn't miss a step.");
		System.out.println("Like I said everyone welcomed me back. Even people that I didn't even talk to. Most of my friends were especially \nto see me and even hugged me.");
		System.out.println("The year went by great and I was thinking about my future. I had the support of my few group of friends and junior year was\napproaching.");
		}
		else
		System.out.print("Wrong answer! Game over fool!");
		
	
		System.out.println("\nJunior Year -" + "Enter third code below");
		int junior = keybd.nextInt();
		
		if (junior == 2018)
		{
		System.out.println("Well you want to keep going. Let's talk about my best year, junior year. I'm so excited!");
		System.out.println("This year was my best year yet. It started rough since I was with people I didn't know while most of my friends\nwere in different classes.");
		System.out.println("Then I met a cool kid named Ricky Perez. He was in fact the coolest kid in the school and he quickly became\none of my closest friends.");
		System.out.println("I also made more close friends named Tyler, Mohammed, Rahul, David, etc. I'm going to fill up this whole\nprogram if I continue listing names.");
        System.out.println("Anyways, even though the classes were more challenging, it was still fun and I still miss those moments\nwith my friends today.");
        /* My favorite class was algebra since it was the class we created the 
         * most chaos in. It was my greatest year. I even made many friends that were
         * girls as well and I loved that year. In that year, I felt like I went from
         * 0 to 100.
         */
		}
		else 
		System.out.println("Now you get stumped. Wow");
        
        System.out.println("\nSenior Year -" + "Enter final year code below");
        int senior = keybd.nextInt();
        
        if (senior == 2019)
        System.out.print("Last year of my golden year; Let's get it!");
        System.out.print("This year, I thought it would have been like last year. It didn't start how I thought it would at the \nbeginning but I got through the year the same way I did last year.");        
        System.out.print("The most challenging part of senior year was preparing for college which allowed me to build a stronger\n relationship with my guidance counselor and the staff"); 
        System.out.print("Ultimately, the year ended quickly with all the festivities and it was great");
        /* I know that this isn't very descriptive but 
         * a) I'm tired
         * b) There's not much to talk about other than college preparation
         */
        
        System.out.print("Enter final code (How much bits are in an integer)");
        int integer = keybd.nextInt();
        
        if (integer == 16)
        System.out.print("Congrats, you have reached my final thoughts");
        /* The years of high school are years that I will remember for the rest of 
         * my life and they hold a special place in my heart. I made many friends 
         * that became close to me. There were moments where I had my best moments and
         * there were moments that I regret. My biggest regret was that I never asked
         * my friend that is a girl to dance back since senior dinner and didn't go to 
         * prom with her and ultimately confess my love to her. I learned a lot from 
         * my high school years and I want to grow as a person more in college.
         */
        System.out.print("This is the end of the program. So sad to see you leave.");
        
		}
        else if (freshman != 2016)
		System.out.println("Unable to view");
		
 
        
	}

}
