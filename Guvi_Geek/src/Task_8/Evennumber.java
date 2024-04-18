package Task_8;

import java.util.Scanner;

public class Evennumber {

	public static void main(String[] args) 
	{
	
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Please Enter Any Number - ");
		int Even=obj.nextInt();
		
		if (Even % 2==0)
		{
			System.out.println("This is Even Number");
		}
		else  // Note: Extra for Practice
		{
			System.out.println("This is odd Number");
		}
        obj.close(); // Close the Scanner object
		}
		

}
