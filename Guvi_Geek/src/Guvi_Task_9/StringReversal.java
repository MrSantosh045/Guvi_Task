package Guvi_Task_9;
import java.util.Scanner;


	public class StringReversal 
	{

	    // Method to reverse a given string
	    public static String reverseString(String inputString) {
	        // Create a StringBuilder to build the reversed string
	        StringBuilder reversed = new StringBuilder();

	        // Iterate over the inputString from end to start
	        for (int i = inputString.length() - 1; i >= 0; i--) {
	            // Append each character to the StringBuilder in reverse order
	            reversed.append(inputString.charAt(i));
	        }

	        // Convert StringBuilder back to String and return the reversed string
	        return reversed.toString();
	    }

	    public static void main(String[] args) {
	        // Create a Scanner object to read input from the console
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a string
	        System.out.print("Enter a string: ");

	        // Read the input string entered by the user
	        String userInput = scanner.nextLine();

	        // Call the reverseString method to reverse the input string
	        String reversedString = reverseString(userInput);

	        // Output the reversed string to the console
	        System.out.println("Reversed string: " + reversedString);

	        // Close the scanner
	        scanner.close();
	    }
	}

