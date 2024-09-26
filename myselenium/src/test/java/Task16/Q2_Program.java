package Task16;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Q2_Program {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mrsan\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the demoblaze website
        driver.get("https://www.demoblaze.com/");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Get the title of the page
        String pageTitle = driver.getTitle();

        // Verify the title and print appropriate message
        if (pageTitle.equals("STORE")) {
            System.out.println("Page landed on correct website");
        } else {
            System.out.println("Page not landed on correct website");
        }

        // Close the browser
        driver.quit();
    }
}
