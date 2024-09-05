 package Task12;
 import java.io.File;
 import java.io.FileNotFoundException;
 import java.util.Scanner;

 public class Q4_FileReaderExample {
     public static void main(String[] args) {
         // Define the file path
         String filePath = "example.txt";

         // Try to read from the file
         try {
             // Create a File object
             File file = new File("C:\\Users\\Mrsan\\NewEmp.xlsx");

             // Create a Scanner object to read the file
             Scanner scanner = new Scanner(file);

             // Read and print file contents line by line
             while (scanner.hasNextLine()) {
                 String line = scanner.nextLine();
                 System.out.println(line);
             }

             // Close the scanner
             scanner.close();
         } catch (FileNotFoundException e) {
             // Handle exception when the file is not found
             System.out.println("Error: File not found. Please check the file path and try again.");
         }
     }
 }
