

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultyElement {
	private int value1;
	public int getValue1() {
		return value1;
	}


	public void setValue1(int value1) {
		this.value1 = value1;
	}


	public char getValue2() {
		return value2;
	}


	public void setValue2(char value2) {
		this.value2 = value2;
	}


	private char value2;
	private String name;
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASHEESH\\Desktop\\Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		List<WebElement> links_count = driver.findElements(By.tagName("a"));
		for(int i=0; i<links_count.size();i++) {
			System.out.println(links_count.get(i).getText());
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
