package Guvi_Task_10;


import java.util.Scanner;

public class Tea1 {
    private boolean isPrepared;
    private boolean hasMilk;
    private boolean hasSugar;

    public Tea1() {
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

        // Create an instance of Tea
        Tea1 myTea = new Tea1();

        // Interactive menu for tea preparation
        System.out.println("Welcome to Tea Preparation!");
        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Prepare Tea");
            System.out.println("2. Add Milk");
            System.out.println("3. Add Sugar");
            System.out.println("4. Exit");

            // Read user choice
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    myTea.prepareTea();
                    break;
                case 2:
                    myTea.addMilk();
                    break;
                case 3:
                    myTea.addSugar();
                    break;
                case 4:
                    System.out.println("Exiting Tea Preparation. Enjoy your tea!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }
}

