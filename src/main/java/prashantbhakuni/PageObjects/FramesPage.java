package prashantbhakuni.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesPage {

	WebDriver driver;
	public FramesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='/frames']")
	private WebElement framesPageBtn;
	
	@FindBy(xpath="//a[@href='/nested_frames']")
	private WebElement nestedFramesBtn;
	
	@FindBy(xpath="//a[@href='/iframe']")
	private WebElement iFrameBtn;
	
	@FindBy(id="content")
	private WebElement middleText;
	
	@FindBy(css="div.tox-icon")
	private WebElement closeBtn;
	
	@FindBy(xpath="//p[contains(text(),'Your content goes here.')]")
	private WebElement iFrameText;
	
	public void gotoFramesPage() {
		framesPageBtn.click();
	}
	
	public String gotoNestedFrames() {
		nestedFramesBtn.click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		return middleText.getText();
	}
	
	public String gotoIframe() {
		iFrameBtn.click();
		closeBtn.click();
		driver.switchTo().frame("mce_0_ifr");
		return iFrameText.getText();
	}
}
