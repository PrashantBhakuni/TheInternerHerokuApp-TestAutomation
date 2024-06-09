package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContextMenuPage {
	
	private WebDriver driver;
	
	public ContextMenuPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/context_menu']")
	private WebElement contextMenuPage;
	
	@FindBy(id="hot-spot")
	private WebElement box;
	
	public void gotoContextMenuPage() {
		contextMenuPage.click();
	}
	
	public void boxClick()
	{
		Actions a = new Actions(driver);
		a.contextClick(box).perform();
	}

	public String getMenuText()
	{
		return driver.switchTo().alert().getText();
	}
}
