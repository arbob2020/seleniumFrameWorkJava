package selenium.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicSearch {

	public static void main(String[] args) throws InterruptedException  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch Chrome
		
		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // deletes all cookies
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		driver.get("https://tsrtconline.in/oprs-web/");
		//can also automate youtube
		
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("banga");
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ui-id-3']/li"));
		
		driver.close();
		
	}

}
