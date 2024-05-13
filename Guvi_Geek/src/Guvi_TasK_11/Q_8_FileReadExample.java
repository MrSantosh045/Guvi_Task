package Guvi_TasK_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q_8_FileReadExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        try {
            File file = new File(filePath);

            // Check if the file exists
            if (!file.exists()) {
                throw new FileNotFoundException("File not found: " + filePath);
            }

            // Read from the file
            Scanner fileScanner = new Scanner(file);

            System.out.println("File contents:");

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

            fileScanner.close(); // Close the file scanner
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            // Handle the FileNotFoundException by displaying an error message
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
            // Handle other exceptions if needed
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}
