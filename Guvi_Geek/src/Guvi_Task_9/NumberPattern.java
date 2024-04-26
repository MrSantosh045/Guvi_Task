package Guvi_Task_9;

import java.util.Scanner;

	public class NumberPattern {

	    public static void main(String[] args) {
	        // Create a Scanner object to read input from the console
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the number of rows for the pattern
	        System.out.print("Enter the number of rows: ");
	        int numRows = scanner.nextInt();

	        // Initialize a counter to track the number sequence
	        int number = 1;

	        // Loop through each row from 1 to numRows
	        for (int i = 1; i <= numRows; i++) {
	            // Loop to print numbers for the current row
	            for (int j = 1; j <= i; j++) {
	                // Print the current number and increment the counter
	                System.out.print(number + " ");
	                number++;
	            }
	            // Move to the next line after printing numbers for the current row
	            System.out.println();
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}


