package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch Chrome
		
		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // deletes all cookies
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://www.freecrm.com"); // enter relevant URL

//driver.findElement(By.name("username")).sendKeys("Arbob");
//driver.findElement(By.name("password")).sendKeys("$Fareen$66");
//
//		driver.findElement(By.xpath("EnterXpathHere")).click();
//		driver.switchTo().frame("mainpanel");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("EnterXpathHere")).click();
		
		
		
		
	}

}
