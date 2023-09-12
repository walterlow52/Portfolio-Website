package projects;
import java.util.Scanner;

/**
 * Lab 1- Pig Latin 
 * Computer Programming II (CUS 1116)
 * @author Bronco SSB 
 * 1/31/20 - 2/6/2020 
 * This program will translate a word into pig latin through the use of if statements, different methods, and
 * interaction between the program and the user.
 */

public class PigLatin {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter a word to be translated into Pig Latin"); // prompt
		String input = in.next(); // user input
		
		System.out.println("==> \"" + input + "\""); // console output
		System.out.println("in Pig Latin is");
		System.out.print("\"" + convertPigLatinWord(input) + "\"");

		in.close(); 

	}

	public static boolean isVowel(char c) { // method used to determine if there is a vowel as the first letter in the input
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
			return true; // first letter of the input has a consonant (seen in convertPigLatinWord method)
		} else
			return false; // first letter of the input has a vowel (seen in convertPigLatinWord method)

	}

	public static String convertPigLatinWord(String englishWord) { // method used to translate the user input into pig latin
		
		int first = 0;
		String firstLetter;
		char c = englishWord.charAt(first);
        String th = null;
        
		if (!isVowel(c)) { // determines if isVowel method is false (using !) to see if the input begins with a vowel
			first = 1;  // if first = 1, then the user entered an input with a consonant as the first letter
		}
		else {
			first = 0;  // if first = 0, then the user entered an input with a vowel as the first letter
		}
		
		if (englishWord.charAt(0) == 't' && englishWord.charAt(1) == 'h') {  // converting the input beginning with "th"
			firstLetter = englishWord.substring(2);
			th = englishWord.substring(0,1) + englishWord.substring(1,2);
			return firstLetter + "-" + th + "ay";
			
		}

		if (first == 0) { // converting the input beginning with a vowel
			return englishWord + "-way";
		}
		else { // converting the input beginning with a consonant
			firstLetter = englishWord.substring(first);
			String plWord = englishWord.substring(0, first);
			return firstLetter + "-" + plWord + "ay";
			
		}

	}

}
