import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Method {
	public WebDriver driver;
	
	// Create Launch Method
	public void launchApp(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASHEESH\\Desktop\\Selenium Training\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	// Create method to close the web application-:
	
	public void closeMethod() {
		driver.close();
	}
	
	// Element availability-:
	public void elementAvailable(String locator, boolean expectedResult) {
		boolean result = driver.findElement(By.id("locator")).isDisplayed();
		if(result == expectedResult) {
			System.out.println("TestStep is Passed");
		}
		else {
			System.out.println("TestStep is Faied");
		}
		
	}
	
	
		

	}


