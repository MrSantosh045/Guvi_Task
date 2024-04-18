package Task_8;

import java.util.Scanner;

public class Digit_counter {

	public static void main(String[] args) 
	{
		 try (// Create a Scanner object to take input from the user
		Scanner scanner = new Scanner(System.in)) {
			// Prompt the user to enter an integer
			System.out.print("Enter an integer: ");

			// Read the integer input from the user
			long number = scanner.nextLong();

    
			// Count the number of digits in the integer
			long digitCount = 0;
			// Convert negative number to positive for counting digits
			long temp = Math.abs(number);
			
			// Loop to remove the last digit until the number becomes zero
			while (temp > 0) {
			    temp /= 10; // Remove the last digit
			    digitCount++; // Increment the digit count
			}

			// Print the number of digits in the integer
			System.out.println("Number of digits in the integer: " + digitCount);
		}
    }
	

	}


