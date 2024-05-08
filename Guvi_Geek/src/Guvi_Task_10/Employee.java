package Guvi_Task_10;

import java.util.Scanner;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter methods
 // Getter for ID Return
    public int getID() {
        return id;
    }
 // Getter for first name
    public String getFirstName() {
        return firstName;
    }
 // Getter for Last name
    public String getLastName() {
        return lastName;
    }
 // Getter for Full name
    public String getName() {
        return firstName + " " + lastName;
    }
 // Getter for Salary
    public int getSalary() {
        return salary;
    }
    // Setter for salary
    public void setSalary(int salary) {
        this.salary = salary;
    }
    // Method to calculate annual salary
    public int getAnnualSalary() {
        return salary * 12;
    }
 // Method to raise salary by a given percentage
    public void raiseSalary(int percent) {
        double raiseAmount = salary * (percent / 100.0);
        this.salary += raiseAmount;
    }
    
 // Override toString() method to provide a formatted string representation
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }

    // Static factory method to create Employee object from user input
    public static Employee createEmployeeFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter employee first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter employee last name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter Monthly employee salary:");
        int salary = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        scanner.close();

        return new Employee(id, firstName, lastName, salary);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an Employee object by taking input from the user
        Employee emp = Employee.createEmployeeFromUserInput();

        // Display employee details
        System.out.println("Employee ID: " + emp.getID());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());

        // Raise employee's salary by 30%
        emp.raiseSalary(30);

        // Display updated salary
        System.out.println("Updated Salary after raise: " + emp.getSalary());

        // Display annual salary
        System.out.println("Annual Salary: " + emp.getAnnualSalary());

        // Display employee details using toString() method
        System.out.println(emp);
    }
}
