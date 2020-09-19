import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Calling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASHEESH\\Desktop\\Selenium Training\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");  	//We will use excel conncetivity-DATA Driven Testing Approach
		driver.manage().window().maximize();
		PageObjects Ref = PageFactory.initElements(driver, PageObjects.class);
		
		/*Ref.uid.sendKeys("Asheesh");
		Ref.pwd.sendKeys("Asheesh@123");
		Ref.lid.click();*/
		//Ref.LoginButton.click();
		// String parentWinHandle = driver.getWindowHandle();
	        //System.out.println("Parent window handle: " + parentWinHandle);
	        /*Ref.LoginButton.click();
	        String parentWinHandle1 = driver.getWindowHandle();
	        System.out.println("Parent window handle: " + parentWinHandle1);*/
	        Ref.emailid.sendKeys("8707587754");
	        Ref.password.sendKeys("123@2017");
	        Ref.login.click();
		
		
		
		
		
		
	/*Alert alert = driver.switchTo().alert();
	alert.sendKeys("8707587754");
		//Ref.emailid.sendKeys("8707587754");
*/		
		
	}

}
