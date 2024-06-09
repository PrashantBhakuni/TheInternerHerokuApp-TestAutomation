package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EntryAdPage {

	public EntryAdPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/entry_ad']")
	private WebElement entryAdPageBtn;
	
	@FindBy(xpath="//p[contains(text(),'Close')]")
	private WebElement closeDialogueBox;
	
	@FindBy(xpath="//h3[contains(text(),'Entry Ad')]")
	private WebElement mainWindowText;
	
	public void gotoEntryAdPage() throws InterruptedException {
		entryAdPageBtn.click();
		Thread.sleep(1000);
		closeDialogueBox.click();
		Thread.sleep(1000);
	}
	
	public String getMainText() {
		return mainWindowText.getText();
	}

}
