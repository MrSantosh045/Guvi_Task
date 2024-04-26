package Guvi_Task_9;
import java.util.Scanner;
public class Check_palindrome
{

	

	    // Method to check if a string is a Palindrome
	    public static boolean isPalindrome(String inputString) {
	        // Convert the string to lowercase to handle case-insensitivity
	        inputString = inputString.toLowerCase();

	        // Initialize two pointers: one at the beginning (start) and one at the end (end) of the string
	        int start = 0;
	        int end = inputString.length() - 1;

	        // Iterate over the string using a while loop until the two pointers meet
	        while (start < end) {
	            // Compare characters at the start and end pointers
	            if (inputString.charAt(start) != inputString.charAt(end)) {
	                // If characters don't match, the string is not a palindrome
	                return false;
	            }
	            // Move the start pointer forward and end pointer backward
	            start++;
	            end--;
	        }

	        // If all characters match, the string is a palindrome
	        return true;
	    }

	    public static void main(String[] args) 
	    {
	        // Create a Scanner object to read input from the console
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a string
	        System.out.print("Enter a string: ");
	        
	        // Read the input string entered by the user
	        String userInput = scanner.nextLine();

	        // Check if the input string is a palindrome using the isPalindrome method
	        if (isPalindrome(userInput)) {
	            System.out.println("'" + userInput + "' is a palindrome!");
	        } else {
	            System.out.println("'" + userInput + "' is not a palindrome.");
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}


