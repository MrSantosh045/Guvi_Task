package Task_8;

import java.util.Scanner;

public class Stringlength
{

	public static void main(String[] args) 
	{
		 // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        
        // Read the string input from the user
        String msg = scanner.nextLine();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Calculate the length of the string
        int length = msg.length();

        /* Print the length of the string
		 *  Given string String msg = "Guvi Geek";
		 */
		        
		                
		        // Print the length of the string
		        System.out.println("Length of the string \"" + msg + "\" is: " + length);
	}
}

	


