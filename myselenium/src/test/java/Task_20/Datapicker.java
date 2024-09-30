package Task_20;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Datapicker {

    public static void main(String[] args) {
        // Set up the ChromeDriver executable using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the jQuery UI website
            driver.get("https://jqueryui.com/");

            // Maximize the browser window
           driver.manage().window().maximize();

            // Implicit wait
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

         //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            
           WebElement stringFrame = driver.findElement(By.className("demo-frame"));
            driver.switchTo().frame(stringFrame);
            
         // Click on Datepicker
            driver.findElement(By.xpath("//a[contains(text(),'Datepicker')]")).click();

            // Click on the date field to open the datepicker
            WebElement dateField = driver.findElement(By.xpath("//input[@id='datepicker']"));
            dateField.click();

            // Click on the next month button
            WebElement nextMonth = driver.findElement(By.xpath("//a[contains(.,'Next')]/span[contains(.,'Next')]"));
            nextMonth.click();

            // Click on date 22
            WebElement date22 = driver.findElement(By.xpath("//a[@data-date='22']"));
            date22.click();

            // Get and print the selected date
            String selectedDate = dateField.getAttribute("value");
            System.out.println("The Selected Date is: " + selectedDate);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
