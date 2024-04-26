package Guvi_Task_9;

import java.util.Scanner;

public class AsteriskPattern {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows for the pattern
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        // Loop through each row from 1 to numRows
        for (int i = 1; i <= numRows; i++) {
            if (i % 3 == 1 || i % 3 == 2) {
                // For rows 1, 2, 4, 5 (where i % 3 == 1 or i % 3 == 2)
                System.out.println("* *");
            } else {
                // For row 3 (where i % 3 == 0)
                System.out.println( " * ");
            }
        }

        // Close the scanner
        scanner.close();
    }
}

