import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test111 {
	private static void test1() {
		System.out.println("Inside test1 method");	}
	private static void test2() {
		System.out.println("Inside test2 method");
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASHEESH\\Desktop\\Selenium Training\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Books");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	
		
		String abc = driver.getWindowHandle();
		System.out.println(abc);
		
				
	

	}

}
