package Task_8;

import java.util.Scanner; // Using Scanner Class from util package

public class Selectionstatment {

	public static void main(String[] args) // This is Main Method
	{
		
		Scanner Obj=new Scanner(System.in);// This line creates a new Scanner object named Obj and associates it with the standard input stream (System.in), which represents input from the console.
		System.out.println("Please Enter Value of a -" );
		
		//These lines declare four integer variables a, b, c, and d, and initialize them with specific values. In Java, you declare a variable by specifying its type (int for integer) followed by its name (a, b, c, d), and optionally assign it a value using the assignment operator (=).
		int a=Obj.nextInt();
		
		System.out.println("Please Enter Value of b -" );
		int b=Obj.nextInt();
		
		System.out.println("Please Enter Value of c -" );
		int c=Obj.nextInt();
		
		System.out.println("Please Enter Value of d -" );
		int d=Obj.nextInt();
		
		int s=a+b;
		int p=c+d;
		//This line begins an if statement. An if statement is a conditional statement that allows a program to execute certain code only if a specified condition is true. In this case, the condition being checked is whether the sum of a and b is greater than the sum of c and d.
		
		if (s>p) //or if ((a + b) > (c + d))
		{
			System.out.println("The sum of a and b is greater than the sum of c and d");
			
		}
		else // Note:Extra for Practice
		{
			System.out.println("The sum of a and b is not greater than the sum of c and d.");
		}

        Obj.close(); // Close the Scanner object
		
			
		
	}

}
