package Task_8;

import java.util.Scanner;

public class loopformessage 
{

	public static void main(String[] args)
	{
		
		/*
		 * // Print "Welcome to Guvi" 10 times using a loop 
		 * String A= "Welcome to Guvi";
		 * // for (int i = 0; i < 10; i++) - This Line is Hard coded
		 */	// Now taking input from User for How May Time Print
		String A= "Welcome to Guvi";
		Scanner user=new Scanner(System.in);
		
		System.out.println("How Many Times you want = ");
	
		int b=user.nextInt();
		int count = 0;
	
		for (int i = 0; i < b; i++)
    {
            System.out.println(A);
            
         // Increment the count each time the message is printed
            count++;
        }
        
        // Print the total count of times the message is printed
        System.out.println("The message was printed " + count + " times.");
            

	}

	}

