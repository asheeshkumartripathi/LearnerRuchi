import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASHEESH\\Desktop\\Selenium Training\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://wetransfer.com/");
		driver.manage().window().maximize();
		 //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      /*Alert a = driver.switchTo().alert();
      String s = a.getText();
      a.accept(); // To click on ok button.
      a.dismiss(); // to click on cancel button
      if(s.equals("Customer ID  cannot be left blank.")) {
    	  System.out.println("Pass");
      }
      else {
    	  System.out.println("Fail");
      }*/

     // driver.findElement(By.xpath("//button[@class='uploader__sub-title uploader__directories-dialog-trigger']")).sendKeys("F:\\Data\\RedMi Data\\Images_RedMI\\Images_2019-2020/");
      
      
	}

}
