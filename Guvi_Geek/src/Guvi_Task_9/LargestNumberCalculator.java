package Guvi_Task_9;

import java.util.Scanner;

public class LargestNumberCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the three numbers
        System.out.println("Enter three numbers:");

        // Read the three numbers from the user
        System.out.print("1st number: ");
        int num1 = (int) scanner.nextDouble();

        System.out.print("2nd number: ");
        int num2 = (int) scanner.nextDouble();

        System.out.print("3rd number: ");
        int num3 = (int) scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // Initialize a variable to store the largest number
        int largestNumber;

        // Compare the numbers to find the largest
        if (num1 >= num2 && num1 >= num3) {
            largestNumber = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largestNumber = num2;
        } else {
            largestNumber = num3;
        }

        // Display the largest number
        System.out.println("The largest number is: " + largestNumber);
    }
}

