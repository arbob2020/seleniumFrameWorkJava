package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
	
	public static void main (String[] args){
	
		
		// to execute the Chrome browser we need to setup system property
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	
	// we need to create an object of chromedriver while calling WebDriver interface
	
	WebDriver driver = new ChromeDriver();
	
//	we can maximize the window
	driver.manage().window().maximize();
	
	// to open any URL we need to use driver.get() command and pass the url as String
	
	driver.get("http://tek-school.com/retail/");
	
    //	Validation: To get title of a page we need to use driver.getTitle and store  it in String data type
	
	String pageTitle =driver.getTitle();
	System.out.println(pageTitle);
	
	//	 if page title is equal to TEK SCHOOL then browser should close
	//	if not browser should stay open.
	
	if(pageTitle.equals("TEK SCHOOL")) {
//	to close the browser we use driver.close() or driver.quite
	driver.close();
	} else
		System.out.println("Page Title doesn't Match"); {
		
	}
	

	
	
	}
	
}
