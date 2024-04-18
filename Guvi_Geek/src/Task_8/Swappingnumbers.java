package Task_8;

import java.util.Scanner;

public class Swappingnumbers {

	public static void main(String[] args) {
		// Created Scanner object for taking input from System or Keyboard or User
		Scanner object = new Scanner(System.in);

		System.out.println("Enter value of A = "); // input for A

		int A = object.nextInt();

		System.out.println("Enter value of B = "); // input for B

		int B = object.nextInt();

		// Now Using 3rd Variable for Swapping Numbers

		
		 	int C=B; B=A; A=C;
		 

			/*
			 * Swapping value without using 3rd Variable
			 *  A = A + B; 
			 *  B = A - B;
			 *  A = A - B;
			 */

		System.out.println("Value of A is  = " + A);
		System.out.println("Value of B is  = " + B);

	}

}
