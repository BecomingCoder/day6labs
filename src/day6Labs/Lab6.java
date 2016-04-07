package day6Labs;

import java.util.Scanner;

public class Lab6 {
	public static void main(String[] args) {
		// Setup scanner for user input
		Scanner sc = new Scanner(System.in);
		// Assign variable to user input for loop continue
		String choice = "y";
		// Assign variable to user input for translation
		String userInput;
		// Assign variable to output translation
		String pigLatin = "";
		
		
		// Create stringbuffer from user input
		//StringBuffer makeMePigLatin = new StringBuffer(userInput);
		
		// Welcome message and question for user
		System.out.println("Welcome to the Pig Latin translator");
		// Get user input for translation
		System.out.println("Enter a line to be translated: ");
		// Assign user input to variable 'userInput' and make lowercase
		userInput = sc.nextLine();
		sc = new Scanner(userInput);
		System.out.println(userInput.toLowerCase());
		
		while  (choice.equalsIgnoreCase("y")) {
			char firstVowel;
			
			if (vowel(userInput.charAt(0))) {
				userInput += "ay";
				System.out.println(userInput);
			}
		}

		sc.close();
		System.out.println("See Ya!");
	}

	public static boolean vowel (char aeiou) {
		char i = aeiou;
		return i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u';  
	}
}
