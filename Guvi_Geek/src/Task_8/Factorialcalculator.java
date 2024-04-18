package Task_8;
import java.util.Scanner;
public class Factorialcalculator
	{

	public static void main(String[] args)
	{

		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number to calculate its factorial: ");
		        int number = scanner.nextInt();
		        scanner.close();

		        long factorial = 1;
				/*
				 * //Here, we initialize a variable named factorial of type int to 1. This
				 * variable will hold the factorial of the given number. We start with 1 because
				 * multiplying by 1 doesn't change the value.
				 */
		        for (int i = 2; i <= number; i++) 
		        {
		            factorial *=i;
		        }

		        System.out.println(number + "! = " + factorial);
		    }
		


	}


