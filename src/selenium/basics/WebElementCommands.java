package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) throws InterruptedException {


		
//		open Test Environement
//		Type mac in search field
//		click on search icon 
		
//		setup system property 
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://tek-school.com/retail/");
		
//		We need to store search field in WebElement
		WebElement searchField = driver.findElement(By.name("search"));
		
//		In order to write mac in search filed, we use sendkeys method
		searchField.sendKeys("Mac");
//		 we need to store search button in WebElement
		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button/i"));
		
		searchButton.click();
		
//		Locators in Selenium WebDriver
//		By.ID
//		By.Name
//		By.ClassName
//		By.LinkText
//		By.Xpath -- write xpath for all elements if they don't have id
//		By.cssSelector
		
//		Syntax for HTML locators
//		<tag> attribute = value </tag>
//		attributes can be id, name, className, linkTexts, and any other name.
//		The best and first choice if to find element By.ID -- it is unique and fast.
//		We select xpath or Css Selector
//		id="wishlist-total"
		
//		How find element By.ID and stor it in WebElement-- Wishlist
				
	WebElement wishList = driver.findElement(By.id("wishlist-total"));
	wishList.click(); // this will click on whishlist element in UI
		
		
//	// find element by className and store it in WebElement
//	WebElement shopingCart = driver.findElement(By.className("hidden-xs hidden-sm hidden-md"));
//	shopingCart.click(); // this will click on shopingCart in UI
				
	WebElement currency = driver.findElement(By.className("dropdown-toggle"));
	currency.click(); // this will click on shopingCart in UI
	
	//span[@id='cart-total']
	
	Thread.sleep(3000);
//	driver.close();
				
	}

}
