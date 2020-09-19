import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects {
	/*@FindBy(id="email") WebElement uid;
	@FindBy(id="pass") WebElement pwd;
	@FindBy(xpath="//*[@id='u_0_b']") WebElement lid;*/
	@FindBy(xpath="//*[@href='/account/login?ret=/%3Faffid%3Dsiteplug%"
			+ "26affExtParam1%3D7fb4b14db411f57b8c761a2f4cdd5bed']") WebElement LoginButton;
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']") WebElement emailid;
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']") WebElement password;
	@FindBy(xpath="//*[@class='_2AkmmA _1LctnI _7UHT_c']") WebElement login;
	
}
