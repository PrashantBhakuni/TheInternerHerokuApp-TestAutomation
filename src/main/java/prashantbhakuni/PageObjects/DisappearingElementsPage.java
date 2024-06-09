package prashantbhakuni.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisappearingElementsPage {
	
	public DisappearingElementsPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='/disappearing_elements']")
	private WebElement dissappearingElementBtn;
	
	public void gotoDissappearingElement() {
		dissappearingElementBtn.click();
	}
	
	@FindBy(xpath="//ul/li")
	private List<WebElement> allButtons;
	
	public int countElements() {
		return allButtons.size();
	}
}
