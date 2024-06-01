package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxesPage {
	
	WebDriver driver;
	public CheckboxesPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/checkboxes']")
	WebElement checkboxesBtn;
	
	@FindBy(xpath="//input[@type='checkbox'][1]")
	WebElement checkBox1;
	
	public void gotoCheckboxesPage() {
		checkboxesBtn.click();
	}
	
	public void performAction() {
		checkBox1.click();
	}

}
