package selenium.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch Chrome
		
		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // deletes all cookies
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		
		
		
		//driver.findElement(By.xpath("//input[@class()='gLFyf gsfi' and @type()='text']")).sendKeys("testing");
		//driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::li[@class='sbct']"));
		
		//driver.findElement(By.xpath("[1]"));//body/div[@id='searchform']/form[@id='tsf']/div/descendant::li[@class=]
		//driver.findElement(By.id("puy29d;")).sendKeys("testing");
		
		//List<WebElement> List = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class=sbqs_c]"));
		
		//System.out.println("total number of suggestions in search box:::===> " + List.size());
		
//		for(int i=0; i<List.size(); i++) {
//			System.out.println(List.get(i).getText());
//			if(List.get(i).getText().contains("Java Tutorial")) {
//				List.get(i).click();
//				break;
//			}
//		}
		
		
		
		
	}

}
