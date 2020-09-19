import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASHEESH\\Desktop\\Selenium Training\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		 //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String beforexpath = "//*[@id=\"customers\"]/tbody/tr[" ;
		String afterxpath = "]/td[1]";
		for(int i=2;i<=7;i++){
			String actualxpath = beforexpath+i+afterxpath;
			WebElement a =  driver.findElement(By.xpath(actualxpath));
			String s = a.getText();
					System.out.println(s);
		}
		
		
			
	//	driver.findElement(By.xpath("//a[@href='https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F'")).click();
		

	}

}
