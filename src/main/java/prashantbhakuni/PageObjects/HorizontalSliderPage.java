package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HorizontalSliderPage {

	WebDriver driver;
	public HorizontalSliderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/horizontal_slider']")
	private WebElement horizontalSliderBtn;
	
	@FindBy(xpath="//input[@type='range']")
	private WebElement slider;
	
	public void gotoHorizontalSlider() {
		horizontalSliderBtn.click();
		Actions a = new Actions(driver);
        a.dragAndDropBy(slider, 5, 0).build().perform();
	}

}
