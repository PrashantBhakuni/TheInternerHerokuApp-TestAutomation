package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChallengingDOMPage {
	
	public ChallengingDOMPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/challenging_dom']")
	private WebElement challengingDomBtn;
	
	public void gotoChallengingDOM() {
		challengingDomBtn.click();
	}
	
	// the following locators locate the unique element, no matter how many times we refresh the page or click on the button
	// it is made possible with the help of partent-child traverse
	
	@FindBy(css=".button:nth-of-type(2)")
	private WebElement button2;
	
	@FindBy(xpath="//tbody/tr[1]/td[1]")
	private WebElement lorem1;
	
	@FindBy(xpath="//tbody/tr[2]/td[2]")
	private WebElement ipsum2;
	
	@FindBy(xpath="(//a[@href='#edit'])[7]")
	private WebElement edit7;
	
	@FindBy(xpath="(//a[@href='#delete'])[4]")
	private WebElement delete4;
	
	public void clickButton2() {
		button2.click();
	}
	
	public String getButton2Text() {
		return button2.getText();
	}

}
