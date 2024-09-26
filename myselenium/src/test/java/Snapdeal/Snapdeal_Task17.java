package Snapdeal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class Snapdeal_Task17 {

		
	    public static void main(String[] args) throws Exception {
		      
	        // Setup WebDriverManager
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();

	 
	            //Open the browser and navigate to Snapdeal website
	            driver.get("http://www.snapdeal.com");

	            // Maximize the browser window
	            driver.manage().window().maximize();

	            // Step 2: Move the cursor to the Sign In button and hold it
	            WebElement loginhover = driver.findElement(By.xpath("//div[@class='accountInner']"));
	            Actions actions = new Actions(driver);
	            actions.moveToElement(loginhover).perform();
	            
	            Thread.sleep(5000);
	            // Step 3: Click on the Sign In button
	            WebElement loginButton = driver.findElement((By.linkText("Your Account")));
	            loginButton.click();
	            Thread.sleep(5000);
	            // Step 4: Enter a valid Email Id in the Email Id field
	            WebElement emailField = driver.findElement(By.id("userName"));
	            emailField.sendKeys("testing@mailinator.com");

	            // Cannot automate snap deal with dummy account. Need to create account
	            //Need to enter OTP
	            //Instead written code for steps mentioned in task
	            
	            // Step 5: Click on the Continue button
	            WebElement continueButton = driver.findElement(By.id("checkUser"));
	            continueButton.click();

	            // Step 6: Enter the valid password in the Password field
	           
	            Thread.sleep(2000);
	            WebElement passwordField = driver.findElement(By.id("j_password_login_uc"));
	            passwordField.sendKeys("Test@123");

	            // Step 7: Click on the Login button
	            WebElement loginButtonFinal = driver.findElement(By.id("submitLoginUC"));
	            loginButtonFinal.click();

	            // Step 8: Verify that the user is logged in successfully
	            // Pause to allow time for the login process to complete
	            Thread.sleep(3000);
	            
	            WebElement accountName = driver.findElement(By.cssSelector("span.accountUserName"));
	            if (accountName.getText().contains("Test User")) {
	                System.out.println("Login successful!");
	            } else {
	                System.out.println("Login failed!");
	            }

	            // Close the browser
	            driver.quit();
	        }
	    }
