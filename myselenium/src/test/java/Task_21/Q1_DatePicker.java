package Task_21;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q1_DatePicker {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		
		//Setting up the chrome driver
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
		//Launching the provided url
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		  // Scroll down to the bottom of the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 300);");
        
       

     // Click on Datepicker
       driver.findElement(By.xpath("//a[normalize-space()='Datepicker']")).click();
        
        
        
      //Switching to frame
      		WebElement Frame = driver.findElement(By.className("demo-frame"));
      		driver.switchTo().frame(0);
        
		//Clicking the date field
      	
      		WebElement date =driver.findElement(By.xpath("//input[@id='datepicker']"));
      		date.click();		
		
		//Clicking on next month
      		
      		
		WebElement Navigate=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
		Navigate.click();
		
		
		//Selecting date
		WebElement Selectdate= driver.findElement(By.xpath("//a[@data-date='22']"));
		Selectdate.click();
		
	
		
		//Printing the selected date in console
		String selectedDate = date.getAttribute("value");
		System.out.println("Selected Date : " + selectedDate);
		
		driver.close();

	}

}

/*   Output :
 
 Selected Date : 10/22/2024
 
 */