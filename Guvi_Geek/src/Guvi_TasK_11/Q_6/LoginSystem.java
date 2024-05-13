package Guvi_TasK_11.Q_6;
//LoginSystem class for handling login functionality
public class LoginSystem {
 private static final String EXPECTED_PASSWORD = "password123";

 public void login(String enteredPassword) throws IncorrectPasswordException {
     if (!enteredPassword.equals(EXPECTED_PASSWORD)) {
         throw new IncorrectPasswordException("Incorrect password entered.");
     }
     // If password matches, proceed with login logic
     System.out.println("Login successful!");
     // Additional login logic goes here...
 }
}
