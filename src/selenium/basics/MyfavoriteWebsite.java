package selenium.basics;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyfavoriteWebsite {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.youtube.com");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		if (pageTitle.equals("YouTube")) {
		
		driver.close();
		
		} else System.out.println("Page Title Doesn't Match"); 
		
		
	}

}
