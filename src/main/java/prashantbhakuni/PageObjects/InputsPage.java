package prashantbhakuni.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputsPage {

	WebDriver driver;
	public InputsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/inputs']")
	private WebElement inputsPageBtn;
	
	@FindBy(xpath="//input[@type='number']")
	private WebElement inputBox;
	
	public void gotoInputsPage() {
		inputsPageBtn.click();
		inputBox.sendKeys(Keys.ARROW_UP);
		inputBox.sendKeys(Keys.ARROW_UP);
		inputBox.sendKeys(Keys.ARROW_UP);
		inputBox.sendKeys(Keys.ARROW_UP);
		inputBox.sendKeys(Keys.ARROW_DOWN);
	}

}
