package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigestAuthenticationPage {

	private WebDriver driver;

	public DigestAuthenticationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[contains(text(),'Congratulations! You must have the proper credentials.')]")
	private WebElement msg;
	
	public void gotoDigestAuthPage() {
		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
	}
	
	public String getMessage() {
		return msg.getText();
		
	}
}
