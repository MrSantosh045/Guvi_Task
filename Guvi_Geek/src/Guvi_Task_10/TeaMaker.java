package Guvi_Task_10;import java.util.Scanner;

//TeaMaker.java - Main class to demonstrate polymorphism
public class TeaMaker {
 private static final Scanner scanner = new Scanner(System.in);

 public static void main(String[] args) {
     System.out.println("Welcome to TeaMaker!");

     // Create an array of Tea objects (including subclasses)
     Tea[] teas = new Tea[2];
     teas[0] = new BlackTea("Indian Tea");
     teas[1] = new GreenTea("Forein Tea");

     // Prompt the user to select a beverage type
     while (true) {
         displayMenu();

         int choice = getUserChoice(1, 3);

         switch (choice) {
             case 1:
                 prepareTea(teas[0]); // Prepare Black Tea
                 break;
             case 2:
                 prepareTea(teas[1]); // Prepare Green Tea
                 break;
             case 3:
                 System.out.println("Thank you for using TeaMaker!");
                 scanner.close();
                 System.exit(0); // Exit the program
             default:
                 System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                 break;
         }
     }
 }

 // Method to display the menu options
 private static void displayMenu() {
     System.out.println("\nSelect Beverage Type:");
     System.out.println("1. Black Tea");
     System.out.println("2. Green Tea");
     System.out.println("3. Exit");
 }

 // Method to get valid user choice within a specified range
 private static int getUserChoice(int min, int max) {
     while (true) {
         System.out.print("Enter your choice (" + min + "-" + max + "): ");
         try {
             int choice = scanner.nextInt();
             scanner.nextLine(); // Consume newline after reading int
             if (choice >= min && choice <= max) {
                 return choice;
             } else {
                 System.out.println("Invalid choice. Please enter a number between " + min + " and " + max + ".");
             }
         } catch (java.util.InputMismatchException e) {
             System.out.println("Invalid input. Please enter a valid number.");
             scanner.nextLine(); // Clear invalid input
         }
     }
 }

 // Method to prepare a tea (using polymorphism)
 private static void prepareTea(Tea tea) {
     System.out.println("Preparing " + tea.getName() + "...");

     boolean addMilk = askYesNoQuestion("Would you like to add milk? (yes/no)");
     boolean addSugar = askYesNoQuestion("Would you like to add sugar? (yes/no)");

     displayFinalPreparation(tea, addMilk, addSugar);
 }

 // Helper method to ask a yes/no question and return boolean
 private static boolean askYesNoQuestion(String prompt) {
     while (true) {
         System.out.println(prompt);
         String answer = scanner.nextLine().trim().toLowerCase();
         if (answer.equals("yes")) {
             return true;
         } else if (answer.equals("no")) {
             return false;
         } else {
             System.out.println("Invalid input. Please answer with 'yes' or 'no'.");
         }
     }
 }

 // Method to display final preparation details
 private static void displayFinalPreparation(Tea tea, boolean milkAdded, boolean sugarAdded) {
     System.out.println("\nFinal Tea Preparation:");
     System.out.println("Type: " + tea.getClass().getSimpleName());
     System.out.println("Name: " + tea.getName());
     System.out.println("Prepared: true");
     System.out.println("Milk added: " + milkAdded);
     System.out.println("Sugar added: " + sugarAdded);
 }
}
