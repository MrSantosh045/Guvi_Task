package Task_22;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q1_Handlingwindo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//Setting up the chrome driver
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Launching the provided url
		
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
	     
	     //Clicking on the link 
	     driver.findElement(By.xpath("//div[@class='example']/a")).click();
	     
	    

	     // Handling main window
	     String mw=driver.getWindowHandle();

	     //Switching to new window
	     
	     for(String windowHandle:driver.getWindowHandles())
	     {
	      
	    	 driver.switchTo().window(windowHandle);
	     }
	    

	     //Verifying the new window 

	     WebElement title=driver.findElement(By.xpath("//h3"));
	     
	     if(title.getText().equals("New Window"))
	     {
	      System.out.println("Navigated to New window - "+ title.getText());
	     }
	     else
	     {
	      System.out.println("New window does not exist ");
	     }
	   

	     //Closing the new window
	     driver.close();

	     //switching to main window
	     driver.switchTo().window(driver.getWindowHandles().iterator().next());
	     
	    
	     //verification the main window message
	     
	     WebElement mainWindow=driver.findElement(By.xpath("//div[@class='example']/h3"));
	  
	     
	     if(mainWindow.getText().equals("Opening a new window"))
	     {
	      System.out.println("Main window is active");
	     }
	     else
	     {
	      System.out.println("Main window does not exist");
	     }
	  

	     //Closing the main window
	     driver.close();
	 }

	}

/* Output :
 
Navigated to New window - New Window
Main window is active

 */
