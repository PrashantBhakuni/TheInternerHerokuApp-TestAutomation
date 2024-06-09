package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage {
	
	public DragAndDropPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='/drag_and_drop']")
	private WebElement dragDropBtn;
	
	@FindBy(xpath="//div[@class='column'][1]")
	private WebElement eleA;
	
	@FindBy(xpath="//div[@class='column'][2]")
	private WebElement eleB;
	
	public void gotoDragAndDropPage() {
		dragDropBtn.click();
	}
	public WebElement getElementA() {
		return eleA;
	}
	public WebElement getElementB() {
		return eleB;
	}
	
}
