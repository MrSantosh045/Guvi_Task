package Guvi_TasK_11.Q_7;
import java.util.Scanner;

//Main program
public class AgeValidation {

 // Method to validate age
 public static void validateAge(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException(); // Throw custom exception if age is less than 18
     }
     // No exception thrown if age is 18 or older
 }

 // Main method
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.print("Enter your age: ");
     int age = scanner.nextInt();

     try {
         validateAge(age); // Check if the entered age is valid
         System.out.println("Age is valid. Welcome!");
     } catch (InvalidAgeException e) {
         System.out.println("Invalid Age: " + e.getMessage());
         // You can handle this exception further as needed
     } catch (Exception e) {
         System.out.println("Error: " + e.getMessage());
         // Handle other unexpected exceptions if needed
     } finally {
         scanner.close(); // Close the scanner
     }
 }
}
