package Guvi_Task_9;

import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the marks scored by the student
        System.out.print("Enter the marks scored by the student: ");
        int marks = scanner.nextInt();

        // Validate input marks
        if (marks > 100) {
            System.out.println("Invalid Input"); // Marks cannot be greater than 100
        } else {
            // Determine the grade based on the marks
            String grade;
            if ( marks == 100) {
                grade = "S";
            } else if (marks >= 90 && marks <= 99) {
                grade = "A";
            } else if (marks >= 80 && marks <= 89) {
                grade = "B";
            } else if (marks >= 70 && marks <= 79) {
                grade = "C";
            } else if (marks >= 60 && marks <= 69) {
                grade = "D";
            } else if (marks >= 50 && marks < 59) {
                grade = "E";
            } else if (marks <= 50 ) {
                grade = "F";
                
            } else {
                grade = "Invalid Input"; // Handles any unexpected input
            }

            // Output the grade
            System.out.println("Grade: " + grade);
        }

        // Close the scanner
        scanner.close();
    }
}
