


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Val_Class {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASHEESH\\Desktop\\Selenium Training\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("http://zoopla.co.uk/");
		driver.manage().window().maximize();
		String App_Title = driver.getTitle();
		String App_URL = driver.getCurrentUrl();
		if(App_Title.length() > App_URL.length()){
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
			}
		
		// Step-2
	driver.findElement(By.id("email")).sendKeys("asheeshkumartripathi@gmail.com");
	boolean button_availability = driver.findElement(By.id("u_0_b")).isDisplayed();
	if(button_availability == true) {
		System.out.println("Pass");}
	else System.out.println("Fail");
	boolean button_enable = driver.findElement(By.id("u_0_b")).isEnabled();
	if(button_enable == true) {
		System.out.println("Pass");}
	else System.out.println("Fail");
	driver.findElement(By.id("u_0_13")).click();
	
	
	
	
		
		

	}}


