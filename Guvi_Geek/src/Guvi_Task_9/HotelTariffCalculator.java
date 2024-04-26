package Guvi_Task_9;

import java.util.Scanner;

public class HotelTariffCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the month number (1-12)
        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();

        // Prompt the user to enter the room rent per day
        System.out.print("Enter the room rent per day: ");
        double roomRentPerDay = scanner.nextDouble();

        // Prompt the user to enter the number of days stayed in the hotel
        System.out.print("Enter the number of days stayed: ");
        int daysStayed = scanner.nextInt();

        // Calculate the hotel tariff based on the month and room rent per day
        double totalRoomRent = roomRentPerDay * daysStayed;
        double hotelTariff;

        // Check if the month falls within the peak season (April-June, November-December)
        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                // Apply a 20% increase in room rent during peak seasons
                hotelTariff = totalRoomRent * 1.20;
                break;
            default:
                // Normal room rent for other months
                hotelTariff = totalRoomRent;
                break;
        }

        // Display the hotel tariff with 2 decimal places
        System.out.printf("Hotel Tariff: %.2f RS%n" , hotelTariff);

        // Close the scanner
        scanner.close();
    }
}

