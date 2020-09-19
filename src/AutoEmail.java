import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoEmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASHEESH\\Desktop\\Selenium Training\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://gmail.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='email' and @class='whsOnd zHQkBf']")).sendKeys("akt.knit@gmail.com");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		
	}

}
