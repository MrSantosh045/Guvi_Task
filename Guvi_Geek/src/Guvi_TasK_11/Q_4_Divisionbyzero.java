package Guvi_TasK_11;

import java.util.Scanner;

public class Q_4_Divisionbyzero 
{

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt user to enter two integers
	        System.out.print("Enter the first integer: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second integer: ");
	        int num2 = scanner.nextInt();

	        // Perform division and handle division by zero exception
	        try {
	            int result = divideNumbers(num1, num2);
	            System.out.println("Result of division: " + result);
	        } catch (ArithmeticException e) {
	            System.err.println("Error: Cannot divide by zero. Please enter a non-zero second integer.");
	        }

	        scanner.close();
	    }

	    // Method to perform division of two integers
	    public static int divideNumbers(int dividend, int divisor) {
	        return dividend / divisor;
	    }
	}


