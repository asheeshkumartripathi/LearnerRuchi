import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExp2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASHEESH\\Desktop\\Selenium Training\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		
	// Create webelement for jobs menu
		WebElement jobs = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/ul[1]/li[1]/a/div"));
		a.moveToElement(jobs).build().perform();
		//Click on register now link
		driver.findElement(By.xpath("//a[@href='https://www.naukri.com/account/createaccount?othersrcp=16201&err=1']")).click();
		

	}

}
