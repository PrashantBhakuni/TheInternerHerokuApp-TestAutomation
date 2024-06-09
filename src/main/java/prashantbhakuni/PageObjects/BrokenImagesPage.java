package prashantbhakuni.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrokenImagesPage {

	public BrokenImagesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/broken_images']")
	private WebElement brokenImageBtn;
	
	@FindBy(xpath="//div[@class='example']/img")
	private List<WebElement> allImages;
	
	public void gotoBrokenImagePage() {
		brokenImageBtn.click();
	}
	
	public long countBrokenImages() {
		return allImages.stream().filter(s->s.getAttribute("naturalWidth").equals("0")).count();
		
	}
}
