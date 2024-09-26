package Task16;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1_Program {
    public static void main(String[] args) {
        // Set the path to the actual chromedriver.exe file
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mrsan\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	//C:\Users\Mrsan\chromedriver-win64\chromedriver-win64\chromedriver.exe
       
    	// Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("http://google.com");

        // Print current URL
        System.out.println("Current page URL: " + driver.getCurrentUrl());

        // Reload the page
        driver.navigate().refresh();

        // Close the browser
        driver.quit();
    }
}
