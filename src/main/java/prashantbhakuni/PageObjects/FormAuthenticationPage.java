package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormAuthenticationPage {

	public FormAuthenticationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/login']")
	private WebElement formAuthenticationBtn;
	
	@FindBy(id="username")
	private WebElement userId;
	
	@FindBy(id="password")
	private WebElement userPassword;
	
	@FindBy(css=".fa-sign-in")
	private WebElement loginBtn;
	
//	@FindBy(id="flash")
//	private WebElement errorMessage; 
	
	@FindBy(xpath="//div[@id='flash']")
	private WebElement errorMessage;
	
	public void gotoFormAuthentication() {
		formAuthenticationBtn.click();
	}

	public String getDetails(String userName, String password) {
		userId.sendKeys(userName);
		userPassword.sendKeys(password);
		loginBtn.click();
		return errorMessage.getText();
	}

	
}
