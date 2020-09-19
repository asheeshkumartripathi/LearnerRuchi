import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASHEESH\\Desktop\\Selenium Training\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		WebElement f1 = driver.findElement(By.xpath("/html/body/div[2]/h2"));
		
		//driver.findElement(By.xpath("a[@href='java/applet/package-frame.html']")).click();
		
		driver.switchTo().frame(f1).findElement(By.xpath("//a[@href='java/awt/package-frame.html']")).click();
		
		
		

	}

}
