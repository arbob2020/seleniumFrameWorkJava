package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	// 1. set System property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
	// 2. create object of chromeDriver
		WebDriver driver = new ChromeDriver();
		
	// 3. maximize the browser
		driver.manage().window().maximize();
	
	// 4. set 30 seconds time pageload
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	// 5. Implicit wait is a globale wait that driver will wait before throwing exception.
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	// 6. delete cookie.
		driver.manage().deleteAllCookies();
	
	// 7. navigate to TEK SCHOOL website.
		driver.get("http://tekschool.us/");
		
	// 8. get Title.
		String pageTitle=driver.getTitle();
		System.out.println("This is TEK SCHOOL page title: "+pageTitle);
	
	// 9. refresh the page
		driver.navigate().refresh();
		
	// 10. To slow down exceution which is Hard Stop which is not recommonded in Automation to Slow
	 Thread.sleep(3000);
		
	//11. navigate from TEK SCHOOL page to test environment
		driver.navigate().to("http://tek-school.com/retail/");
		String testEnvpageTitle = driver.getTitle();
		System.out.println("This is Test Env page title: "+ testEnvpageTitle);
		Thread.sleep(3000);
		
		
	// 12. Navigate back to the TEK SCHOOL page to move on
		driver.navigate().back();
		
	// 13. navigate forward to next URL
		driver.navigate().forward();
				
		Thread.sleep(3000);
		// 12. close browser.
//		driver.close();
				
		
	}

}
