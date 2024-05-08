package Guvi_Task_10.Tea_Subclass_6;

import java.util.Scanner;
import java.util.Scanner;

public class Tea {
    protected boolean isPrepared;
    protected boolean hasMilk;
    protected boolean hasSugar;

    public Tea() {
        this.isPrepared = false;
        this.hasMilk = false;
        this.hasSugar = false;
    }

    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing basic tea with hot water and tea leaves...");
            isPrepared = true;
        } else {
            System.out.println("Tea is already prepared.");
        }
    }

    public void addMilk() {
        if (!isPrepared) {
            System.out.println("Please prepare tea first.");
            return;
        }

        if (!hasMilk) {
            System.out.println("Adding milk to the tea...");
            hasMilk = true;
        } else {
            System.out.println("Milk is already added.");
        }
    }

    public void addSugar() {
        if (!isPrepared) {
            System.out.println("Please prepare tea first.");
            return;
        }

        if (!hasSugar) {
            System.out.println("Adding sugar to the tea...");
            hasSugar = true;
        } else {
            System.out.println("Sugar is already added.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to select tea type
        System.out.println("Select Tea Type:");
        System.out.println("1. Black Tea");
        System.out.println("2. Green Tea");
        System.out.println("3. Herbal Tea");

        int choice = scanner.nextInt();

        // Create appropriate tea object based on user choice
        Tea tea;
        switch (choice) {
            case 1:
                tea = new BlackTea();
                break;
            case 2:
                tea = new GreenTea();
                break;
            case 3:
                tea = new HerbalTea();
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Black Tea.");
                tea = new BlackTea();
                break;
        }

        // Prepare the selected tea
        tea.prepareTea();

        // Ask user if they want to add milk
        System.out.println("\nWould you like to add milk? (yes/no)");
        String addMilkChoice = scanner.next();
        if (addMilkChoice.equalsIgnoreCase("yes")) {
            tea.addMilk();
        }

        // Ask user if they want to add sugar
        System.out.println("\nWould you like to add sugar? (yes/no)");
        String addSugarChoice = scanner.next();
        if (addSugarChoice.equalsIgnoreCase("yes")) {
            tea.addSugar();
        }

        // Display final tea preparation status
        System.out.println("\nFinal Tea Preparation:");
        System.out.println("Type: " + tea.getClass().getSimpleName());
        System.out.println("Prepared: " + tea.isPrepared);
        System.out.println("Milk added: " + tea.hasMilk);
        System.out.println("Sugar added: " + tea.hasSugar);

        // Close scanner
        scanner.close();
    }
}
