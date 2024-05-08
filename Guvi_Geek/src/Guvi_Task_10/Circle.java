package Guvi_Task_10;

public class Circle {
    // Data member
    private double radius;

    // Constructors
    // Constructor with no arguments (default constructor)
    public Circle() {
        this.radius = 1.0; // Default radius is 1.0
    }

    // Constructor with radius as argument
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Getter and setter for radius (optional)
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a Circle object with default constructor
        Circle circle1 = new Circle();
        System.out.println("Circle 1 - Radius: " + circle1.getRadius());
        System.out.println("Circle 1 - Circumference: " + circle1.calculateCircumference());

        // Create a Circle object with radius as argument
        double userRadius = 3.5; // Example radius entered by user
        Circle circle2 = new Circle(userRadius);
        System.out.println("Circle 2 - Radius: " + circle2.getRadius());
        System.out.println("Circle 2 - Circumference: " + circle2.calculateCircumference());
    }
}
