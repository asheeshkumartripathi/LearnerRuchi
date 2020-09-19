import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASHEESH\\Desktop\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://zoopla.co.uk/");
		driver.manage().window().maximize();
		WebElement email_id = driver.findElement(By.id("emaill"));
		WebElement pwd = driver.findElement(By.id("pass"));
		WebElement login_button = driver.findElement(By.id("u_0_b"));
		email_id.sendKeys("asheeshkumartripathi@gmail.com");
		//email_id.sendKeys("ruchi.jain@gmail.com");
		//email_id.sendKeys("aktrjtt@gmail.com");
		pwd.sendKeys("Asheeshkumartripathi#445533");
		login_button.click();
		
		
		

	}

}
