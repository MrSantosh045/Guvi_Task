package Task_20;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignupAndLogin {

	public static void main(String[] args) {
		
				//Setting up the chrome driver
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
			
				//Launching the provided url
				driver.get("https://www.guvi.com/");
				driver.manage().window().maximize();
				
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
				

                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//Registering as a new user by filling up the respective fields
				driver.findElement(By.xpath("//a[text()='Sign up']")).click();
				driver.findElement(By.id("name")).sendKeys("Test User");
				driver.findElement(By.id("email")).sendKeys("testuser12111@gmail.com");
				driver.findElement(By.id("password")).sendKeys("Abcdefg@123456");
				driver.findElement(By.id("mobileNumber")).sendKeys("8208101127");
				
				//Clicking on sign-up button
				driver.findElement(By.id("signup-btn")).click();
				
				//Verifying if the user has been successfully registered
				WebElement reg=driver.findElement(By.xpath("//div[@class='sub-head']"));
			    if (reg.getText().equals("Successfully Registered"))
			    {
			     System.out.println("User is successfully registered");
			    }
			    else
			    {
			     System.out.println("User is not successfully registered");
			    }
			  
			    //Navigating to the homepage to Login with the registered credentials
				driver.navigate().back();
				driver.findElement(By.id("login-btn")).click();
				
				
//				  // Wait for the pop-up to appear and switch to it
//		        Alert alert = driver.switchTo().alert();
//		        
//		        // Accept the pop-up (clicks on "OK" or "Allow")
//		        alert.accept();
		        
				//Providing registered email and password 
				driver.findElement(By.id("email")).sendKeys("mrsantosh045@gmail.com");
				driver.findElement(By.id("password")).sendKeys("Prad@0022");
				
				driver.findElement(By.xpath("//button[@id='login_button']")).click();

				driver.findElement(By.xpath("//button[contains(@class,'btn dropdown account-box-toggler')]")).click();

			    WebElement name=driver.findElement(By.xpath("//div/h6[text()='Test ']"));
			    
			    //Verifying if the user has been successfully signed in
			    if (name.getText().equals("Test User"))
			    {
			     System.out.println("The user has been signed in successfully");
			    }
			    else
			    {
			     System.out.println("Failed to sign in");
			    }

			    //Closing the Browser
			    driver.close();
				
				
				
				

	}

}