package Guvi_Task_10.Q1_Implementation;

import java.util.Scanner;

public class Person 
{

    public static void main(String[] args) {
        // Create a Person object by taking input from the user
        Person person = Person.createPersonFromUserInput();

        // Display the details of the created Person
        System.out.println("Person's Name: " + person.getName());
        System.out.println("Person's Age: " + person.getAge());
    }
	

	 
	    private String name;
	    private int age;

	    // Constructor
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getter for name
	    public String getName() {
	        return name;
	    }

	    // Getter for age
	    public int getAge() {
	        return age;
	    }

	    // Method to set the name
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Method to set the age
	    public void setAge(int age) {
	        this.age = age;
	    }

	    // Method to take input from user and initialize attributes
	    public static Person createPersonFromUserInput() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter person's name:");
	        String name = scanner.nextLine();

	        System.out.println("Enter person's age:");
	        int age = scanner.nextInt();

	        // Consume newline left after nextInt()
	        scanner.nextLine();

	        // Create a new Person object with the input data
	        Person person = new Person(name, age);

	        // Close the scanner
	        scanner.close();

	        return person;
	    }

	}

