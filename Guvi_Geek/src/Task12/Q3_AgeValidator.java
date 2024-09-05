package Task12;

import java.util.Scanner;

//Main class
public class Q3_AgeValidator {
 // Method to validate age
 public static void validateAge(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Age is less than 18. Access denied!");
     } else {
         System.out.println("Age is valid. Access granted!");
     }
 }

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter your age: ");
     int age = scanner.nextInt();

     try {
         validateAge(age); // Validate user age
     } catch (InvalidAgeException e) {
         System.out.println("Error: " + e.getMessage()); // Catch and handle exception
     }

     scanner.close();
 }
}
