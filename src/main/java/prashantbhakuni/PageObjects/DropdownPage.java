package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

	WebDriver driver;
	public DropdownPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/dropdown']")
	private WebElement dropdwonPageBtn;
	
	@FindBy(id="dropdown")
	private WebElement options;
	

	public void gotoDropDownPage() {
		
		dropdwonPageBtn.click();
	}
	
	public void getDropdownOptions() {
		Select s = new Select(options);
		s.selectByIndex(1);
	}

}
