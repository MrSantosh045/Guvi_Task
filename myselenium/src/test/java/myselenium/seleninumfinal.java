package myselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleninumfinal {

	public static void main(String[] args) throws Exception
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/login/");

	driver.manage().window().maximize();

	// For Finding Email Address field
	driver.findElement(By.id("email")).sendKeys("Santosh");
	Thread.sleep(3000);
	driver.findElement(By.id("pass")).sendKeys("sd@dsd1212");
	Thread.sleep(3000);
	// now Click on Login Button

	driver.findElement(By.name("login")).click();
	Thread.sleep(3000);

	// Find the error message element
	WebElement errorMessage= driver.findElement(By.xpath("//div[@class='_9ay7']"));

 // Check if error message is displayed
    if(errorMessage.isDisplayed()) {
        // Check if error message is in red color
        String color = errorMessage.getCssValue("color");
        if(color.contains("rgb(240, 40, 73)")) { // Red color in RGB
            System.out.println("Error message displayed in red color.");

            // Check if error text is correct
            String expectedErrorMessage = "The password that you've entered is incorrect. ";
            String actualErrorMessage = errorMessage.getText();


            if(actualErrorMessage.equals(expectedErrorMessage))
            {
                System.out.println("Error message text is correct.");
            }
            else
            {
                System.out.println("Error message text is incorrect.");
            }}}}}
//
//            else
//            {
//            System.out.println("Error message is not displayed in red color.");
//            }
//            else
//            {
//            	System.out.println("Error message is not displayed.");
//            }
//
//    // Close the browser
//    driver.quit();
//}
//}
//