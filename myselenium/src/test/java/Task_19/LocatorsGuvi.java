package Task_19;

	

	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class LocatorsGuvi {

		public static void main(String[] args) throws Exception {
			//setting Chrome driver Setup
			WebDriverManager.chromedriver().setup();
			
			//Launching chrome driver instance
			WebDriver driver=new ChromeDriver();
			
			//Used to launch a URL
			driver.get("https://www.guvi.in/register");
			
			//Maximize the window
			driver.manage().window().maximize();
			//Declare and initialise a Explicit wait,also specify the timouts of the wait
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
			
			//Using ID locator with the Explicit wait
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).
			sendKeys("Abinaya");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).
			sendKeys("abivicky1992@gmail.com");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).
			sendKeys("abivicky@123");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mobileNumber"))).
			sendKeys("9876543210");
			driver.findElement(By.id("signup-btn")).click(); 
			
			/* //Using Class locator
			
			driver.findElement(By.className("form-control")).sendKeys("Abinaya");
			Thread.sleep(2000);
			driver.findElement(By.id("email")).sendKeys("abivicky1992@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys("abivicky@123");
			Thread.sleep(2000);
			driver.findElement(By.className("form-control countrycode-left")).sendKeys("9876543210");
			System.out.println("Hi");
			Thread.sleep(2000);
			driver.findElement(By.className("btn signup-btn")).click(); */
			
			//Using TagName Locator
			List <WebElement> list = driver.findElements(By.tagName("a"));
			Thread.sleep(2000);
			System.out.println("Number of links: "+list.size());
			for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i).getText());
			}
	        	//Closing the browser
	      		// driver.close();
			
	       		 //Using CSS Selector (Combining Attributes)
	       		/*//Tagname ans ID using [#]
	        	driver.findElement(By.cssSelector("input#name")).sendKeys("Abinaya");
	        	Thread.sleep(2000);
			driver.findElement(By.cssSelector("input#email")).sendKeys("abivicky1992@gmail.com");
			 Thread.sleep(2000);
			driver.findElement(By.cssSelector("input#password")).sendKeys("abivicky@123");
			 Thread.sleep(2000);
			driver.findElement(By.cssSelector("input#mobileNumber")).sendKeys("9876543210");
			 Thread.sleep(2000);
			driver.findElement(By.cssSelector("a#signup-btn")).click(); */
			
			/* //Tag and class using [.]. We have same class name for all text fields. So just taken one
			 driver.findElement(By.cssSelector("input.form-control")).sendKeys("Abinaya");
			 driver.findElement(By.cssSelector("a[class='btn signup-btn']")).click();
			 */
			
			/* //Tag and class with contains. Matching a sub-string
			 *  
			 driver.findElement(By.cssSelector("input[id*='me']")).sendKeys("Abinaya");
		     Thread.sleep(2000);
		     driver.findElement(By.cssSelector("input[id*='ail']")).sendKeys("abivicky1992@gmail.com");
		     Thread.sleep(2000);
			 driver.findElement(By.cssSelector("input[id*='pa']")).sendKeys("abivicky@123");
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("input[id*='Num']")).sendKeys("9876543210");
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("a[id*='up']")).click();   */   
			
			/* //Tag and class stats-with(^ exponent) symbol. Matching a prefix.
			 driver.findElement(By.cssSelector("input[id^='na']")).sendKeys("Abinaya");
		     	 Thread.sleep(2000);
		    	 driver.findElement(By.cssSelector("input[id^='em']")).sendKeys("abivicky1992@gmail.com");
		    	 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("input[id^='pa']")).sendKeys("abivicky@123");
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("input[id^='mo']")).sendKeys("9876543210");
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("a[id^='sign']")).click();    */
			
			/* //Tag and class ends-with($ dollar) symbol. Matching a suffix. 
			driver.findElement(By.cssSelector("input[id$='me']")).sendKeys("Abinaya");
		     	Thread.sleep(2000);
		     	driver.findElement(By.cssSelector("input[id$='il']")).sendKeys("abivicky1992@gmail.com");
		     	Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id$='rd']")).sendKeys("abivicky@123");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id$='ber']")).sendKeys("9876543210");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("a[id$='btn']")).click(); */
			  
			
		/*	//Tagname and attribute using tagname [attribute='value']syntax
			 driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Abinaya");
		     	Thread.sleep(2000);
		     	driver.findElement(By.cssSelector("input[type='email']")).sendKeys("abivicky1992@gmail.com");
		     	Thread.sleep(2000);
			 driver.findElement(By.cssSelector("input[type='password']")).sendKeys("abivicky@123");
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("input[style='padding-left: 81px;']")).sendKeys("9876543210");
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("a[class='btn signup-btn']")).click(); */
	       
		/*	//Tagname,class and attribute [attribute='value']syntax
			
			 driver.findElement(By.cssSelector(" input.form-control[id='name']")).sendKeys("Abinaya");
		    	 Thread.sleep(2000);
		    	 driver.findElement(By.cssSelector("input.form-control[type='email']")).sendKeys("abivicky1992@gmail.com");
		     	Thread.sleep(2000);
			 driver.findElement(By.cssSelector("input.form-control[type='password']")).sendKeys("abivicky@123");
			 Thread.sleep(2000);
			 //driver.findElement(By.cssSelector("input.form-control[style='padding-left: 81px;']")).sendKeys("9876543210");
			 //Thread.sleep(2000);
			 driver.findElement(By.cssSelector("a.signup-btn[id='signup-btn']")).click();
			
			*/ 
			
			/* //XPath. Its of two types. 1. Absolute or Full XPath
			driver.findElement(By.xpath("/html/body/main/section/div/div[2]/form/div[1]/input")).sendKeys("Abinaya");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/main/section/div/div[2]/form/div[2]/input")).sendKeys("abivicky1992@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/main/section/div/div[2]/form/div[3]/input")).sendKeys("abivicky@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/main/section/div/div[2]/form/div[4]/div[1]/input")).sendKeys("9876543210");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/main/section/div/div[2]/form/a")).click();
			Thread.sleep(2000);
			*/
			
		/*	//Relative XPath /Partial Xpath with single attribute.
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Abinaya");
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abivicky1992@gmail.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abivicky@123");
			driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9876543210");
			driver.findElement(By.xpath("//a[@id='signup-btn']")).click(); */
			
		/*	//Relative XPath /Partial Xpath with Multiple attribute.
			driver.findElement(By.xpath("//input[@id='name'][@class='form-control']")).sendKeys("Abinaya");
			driver.findElement(By.xpath("//input[@id='email'][@type='email']")).sendKeys("abivicky1992@gmail.com");
			driver.findElement(By.xpath("//input[@id='password'][@type='password']")).sendKeys("abivicky@123");
			driver.findElement(By.xpath("//input[@id='mobileNumber'][@class='form-control countrycode-left']")).sendKeys("9876543210");
			driver.findElement(By.xpath("//a[@id='signup-btn'][@class='btn signup-btn']")).click();
		
		*/
		/*	//Relative XPath with contains method. syntax : //tagname [contains(@attributeName2,attributeValue)]
			driver.findElement(By.xpath("//input[contains(@id,'name')]")).sendKeys("Abinaya");
			driver.findElement(By.xpath("//input[contains(@id,'ail')]")).sendKeys("abivicky1992@gmail.com");
			driver.findElement(By.xpath("//input[contains(@type,'wor')]")).sendKeys("abivicky@123");
			driver.findElement(By.xpath("//input[contains(@style,'left')]")).sendKeys("9876543210");
			driver.findElement(By.xpath("//a[contains(@id,'signup')]")).click(); 
		*/	
		/*	//XPath Using text() method: with syntax //tagname[text()=textvalue]
			driver.findElement(By.xpath("//a[text()='Login']")).click();
		*/
		/*	//XPath Using contains text() method: with syntax //tagname[contains(text(),textvalue)]
			driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		*/
		/*	//XPath Using starts-with() method with syntax: //tagname[starts-with(@attribute_name1,'attribute_value1')]
			//input[starts-with(@id,'name')]
			driver.findElement(By.xpath("//input[starts-with(@id,'na')]")).sendKeys("Abinaya");
			driver.findElement(By.xpath("//input[starts-with(@id,'em')]")).sendKeys("abivicky1992@gmail.com");
			driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys("abivicky@123");
			driver.findElement(By.xpath("//input[starts-with(@id,'mob')]")).sendKeys("9876543210");
			driver.findElement(By.xpath("//a[starts-with(@id,'sig')]")).click(); 
		*/
		/*	//XPath Using AND and OR operator(Both the conditions must be true)
		 	//syntax://tagname[@attribute_name1='attribute_value1' and @attribute_name2='attribute_value2]
			driver.findElement(By.xpath("//input[@id='name' and @class='form-control']")).sendKeys("Abinaya");
			driver.findElement(By.xpath("//input[@id='email' and @type='email']")).sendKeys("abivicky1992@gmail.com");
			driver.findElement(By.xpath("//input[@id='password' and @type='password']")).sendKeys("abivicky@123");
			driver.findElement(By.xpath("//input[@id='mobileNumber' and @data-intl-tel-input-id='0']")).sendKeys("9876543210");
			driver.findElement(By.xpath("//a[@id='signup-btn']")).click(); 
		*/
			
		/*	//XPath Using AND and OR operator(Any one conditions must be true)
			//syntax://tagname[@attribute_name1='attribute_value1' or @attribute_name2='attribute_value2]
			driver.findElement(By.xpath("//input[@id='name' or @class='qwerty']")).sendKeys("Abinaya");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='email' or @type='mai']")).sendKeys("abivicky1992@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='password' or @type='sword']")).sendKeys("abivicky@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='mobileNumber' or @data-intl-tel-input-id='9']")).sendKeys("9876543210");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='signup-btn']")).click(); 
		*/
		}
		

	}


	/*Number of links: 4

	Login
	Sign Up
	*/

