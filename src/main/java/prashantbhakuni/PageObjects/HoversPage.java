package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoversPage {

	WebDriver driver;
	public HoversPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='/hovers']")
	private WebElement hoversBtn;
	
	@FindBy(css=".figure:nth-of-type(2)")
	private WebElement image2;
	
	@FindBy(xpath="(//h5)[2]")
	private WebElement user2;
	
	public String gotoHoversPage() {
		hoversBtn.click();
		Actions a = new Actions(driver);
		a.moveToElement(image2).perform();
		return user2.getText();
	}
}
