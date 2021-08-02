package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirfoxBrowserTest {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");

	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	driver.get("http://tekschool.us/");
	driver.get("http://tek-school.com/retail/");

	WebElement searchField = driver.findElement(By.xpath("//input[@placeholder='Search']"));
	
	// we can pass a value by using the sendkeys method in the search field
	
	searchField.sendKeys("Mac");
	// we store search field in WebElement
	WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button/i"));
	
	// we need to click on it
	searchButton.click();
	
	WebElement addToCart = driver.findElement(By.xpath("//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]"));

	addToCart.click();

	WebElement MacBookPro = driver.findElement(By.xpath("//a[normalize-space()='MacBook Pro']"));
	
	MacBookPro.click();
	
	
	
	//	Thread.sleep(60);
//	driver.close();
	
	
	//input[@placeholder='Search'] 
	
//	driver.manage().window().maximize();
//	driver.manage().deleteAllCookies();
//
//	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//	Thread.sleep(2000);
//
//	driver.close();
	
//	open Test Environement
//	Type mac in search bar
//	click on search Icon
	
	
	
	
	
	}
	
}
