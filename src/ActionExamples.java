import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;

public class ActionExamples {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASHEESH\\Desktop\\Selenium Training\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gst.gov.in/");
		 //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// Refresh the page-: F5
		Actions a = new Actions(driver);
	//	a.sendKeys(Keys.F5).build().perform();
	//	System.out.println("First action done");
		// Open a new tab - Control + t
	//	a.sendKeys(Keys.CONTROL+ "t").build().perform();
	//	System.out.println("Second action done");
		// Open a new window - control + n
		a.sendKeys(Keys.CONTROL+"n").build().perform();
		System.out.println("Third action done");
		
		// Drag and Drop-:
	a.clickAndHold(driver.findElement(By.xpath(""))).moveToElement(driver.findElement(By.xpath(""))).release().build().perform();
		
		
//	driver.manage().timeouts().implicitlyWait(time, arg1)
		

	}

}
