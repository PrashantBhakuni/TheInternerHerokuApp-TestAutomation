package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxesPage {
	
	public CheckboxesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/checkboxes']")
	private WebElement checkboxesBtn;
	
	@FindBy(xpath="//input[@type='checkbox'][1]")
	private WebElement checkBox1;
	
	public void gotoCheckboxesPage() {
		checkboxesBtn.click();
	}
	
	public void performAction() {
		checkBox1.click();
	}

}
