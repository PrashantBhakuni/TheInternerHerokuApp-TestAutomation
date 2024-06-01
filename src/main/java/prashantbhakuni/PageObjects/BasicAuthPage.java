package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicAuthPage {
	
	WebDriver driver;

	public BasicAuthPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(linkText="Basic Auth")
//	WebElement basicAuthBtn;
	
	@FindBy(xpath="//p[contains(text(),'Congratulations! You must have the proper credentials.')]")
	WebElement msg;
	
	public void gotoBasicAuthPage() {
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
	
	public String getMessage() {
		return msg.getText();
		
	}
	
	

}
