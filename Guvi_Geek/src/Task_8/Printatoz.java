package Task_8;

public class Printatoz {

	public static void main(String[] args) 
	{
		 
		int count = 0; // Initialize count variable to count characters
        
        // Loop through characters from A to Z
        for (char ch = 'A'; ch <= 'Z'; ch++) 
        {
            System.out.print(ch + " "); // Print the character
            count++; // Increment the count
        }
        
        System.out.println("\nTotal characters: " + count); // Print total count of characters
    
        }
	

	}


