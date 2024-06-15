package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FloatingMenuPage {

	WebDriver driver;
	public FloatingMenuPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='/floating_menu']")
	private WebElement floatingMenuBtn;
	
	@FindBy(xpath="//a[@href='#home']")
	private WebElement homeBtn;
	
	@FindBy(xpath="//a[@href='#news']")
	private WebElement newsBtn;
	
	@FindBy(xpath="//a[@href='#contact']")
	private WebElement contactBtn;
	
	@FindBy(xpath="//a[@href='#about']")
	private WebElement about;
	
	public void gotoFloatingMenu() {
		floatingMenuBtn.click();
	}
	
	public String setHome() {
		homeBtn.click();
		return driver.getCurrentUrl();
	}
	
	public String setNews() {
		newsBtn.click();
		return driver.getCurrentUrl();
	}
	
	public String setContact() {
		contactBtn.click();
		return driver.getCurrentUrl();
	}
	
	public String setAbout() {
		about.click();
		return driver.getCurrentUrl();
	}
}
