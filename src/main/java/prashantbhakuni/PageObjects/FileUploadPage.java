package prashantbhakuni.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage {

	WebDriver driver;
	public FileUploadPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='/upload']")
	private WebElement fileObjectPageBtn;
	
	@FindBy(id="file-upload")
	private WebElement chooseFile;
	
	@FindBy(id="file-submit")
	private WebElement uploadBtn;
	
	public void gotoFileUploadPage() {
		fileObjectPageBtn.click();
	}
	
	public void uploadFile() {
		chooseFile.sendKeys("C:\\Users\\Prashant\\Downloads\\puppy_and_kitten.jpg");
		uploadBtn.click();
	}
	
}
