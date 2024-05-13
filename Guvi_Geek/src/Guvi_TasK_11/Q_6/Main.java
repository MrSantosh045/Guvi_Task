package Guvi_TasK_11.Q_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoginSystem loginSystem = new LoginSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        try {
            loginSystem.login(enteredPassword);
        } catch (IncorrectPasswordException e) {
            System.err.println("Login failed: " + e.getMessage());
            // Additional error handling or user notification logic can be added here
        } finally {
            scanner.close();
        }
    }
}
