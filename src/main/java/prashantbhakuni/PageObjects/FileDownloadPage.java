package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileDownloadPage {

	public FileDownloadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/download']")
	private WebElement fileDownloadPageBtn;

	@FindBy(xpath="//a[contains(text(),'puppy_and_kitten.jpg')]")
	private WebElement puppyImage;
	
	public void gotofileDownloadPage() {
		fileDownloadPageBtn.click();
	}
	
	public void downloadImage() throws InterruptedException {
		puppyImage.click();
		Thread.sleep(3000);
	}
}
