package Task12;

import java.util.Scanner;

public class Q1_ArithmeticExc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Get user input
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            
            // Perform division
            int result = num1 / num2;
            
            // Output result
            System.out.println("The result of the division is: " + result);
            
        } catch (ArithmeticException e) {
            // Handle division by zero error
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
