package Guvi_TasK_11.Q_7;
//InvalidAgeException.java
public class InvalidAgeException extends Exception {

 public InvalidAgeException() {
     super("Age must be 18 or older."); // Set a default error message
 }

 public InvalidAgeException(String message) {
     super(message); // Allow custom error message
 }
}
