package Task_8;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		    
		        // Creating a Scanner object to read input from the user
		        Scanner scanner = new Scanner(System.in);
		        
		        // Prompting the user to enter a number
		        System.out.print("Enter a number to check if it's prime: ");
		        
		        // Reading an integer input from the user and storing it in the variable 'number'
		        int number = scanner.nextInt();
		        
		        // Closing the Scanner object to release system resources
		        scanner.close();
		        
		        // Checking if the entered number is prime by calling the isPrime() method
		        if (isPrime(number)) {
		            
		            // Printing the result if the number is prime
		            System.out.println(number + " is a prime number.");
		            
		        } else { // If the entered number is not prime
		            
		            // Printing the result if the number is not prime
		            System.out.println(number + " is not a prime number.");
		            
		        } // End of the if-else block
		    } // End of the main method

		    // Method declaration to check if a number is prime
		    static boolean isPrime(int num) 
		    {
		        
		        // If num is less than or equal to 1, it's not prime
		        if (num <= 1) {
		            return false;
		        }

		        // Loop to check divisibility of num from 2 to the square root of num
		        for (int i = 2; i * i <= num; i++) {
		            
		            // If num is divisible by 'i', it's not prime
		            if (num % i == 0) {
		                return false; // Return false if num is divisible by any number other than 1 and itself
		            }
		        }
		        
		        // If num is not divisible by any number other than 1 and itself, it's prime
		        return true;
		    } // End of the isPrime method
		} // End of the PrimeChecker class


	


