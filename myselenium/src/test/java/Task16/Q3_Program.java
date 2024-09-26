package Task16;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Q3_Program {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mrsan\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

      
       
        // Set an implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Navigate to Wikipedia homepage
        driver.get("https://www.wikipedia.org/");
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Set an implicit wait 2
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        // Find the search box, enter the query "Artificial Intelligence" and submit the form
        WebElement searchBox = driver.findElement(By.id("searchInput"));
        searchBox.sendKeys("Artificial Intelligence");
        searchBox.submit();

        // Find the "History" section link using its link text and click on it
        WebElement historySectionLink = driver.findElement(By.linkText("History"));
        historySectionLink.click();

        // Get the section title after navigating to the "History" section
        WebElement sectionTitle = driver.findElement(By.id("firstHeading"));
        System.out.println("The title of the section is: " + sectionTitle.getText());

        // Close the browser
        driver.quit();
    }
}


