package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPage {

	public DynamicControlsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/dynamic_controls']")
	private WebElement dynamicControlsPageBtn;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy(xpath="//button[contains(text(),'Remove')]")
	private WebElement removeBtn;
	
	@FindBy(xpath="//button[contains(text(),'Add')]")
	private WebElement addBtn;
	
	@FindBy(id="message")
	private WebElement actionTxt;
	
	@FindBy(xpath="//button[contains(text(),'Enable')]")
	private WebElement enableBtn;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement textBox;
	
	@FindBy(xpath="//button[contains(text(),'Disable')]")
	private WebElement disableBtn;
	
	public void gotoDynamicControls() {
		dynamicControlsPageBtn.click();
	}
	
	public void checkboxSection() {
		checkbox.click();
		removeBtn.click();
	}
	
	public void textboxSection() throws InterruptedException {
		enableBtn.click();
		Thread.sleep(3000);
		textBox.sendKeys("Hola Amigo");
	}
	
	public void addCheckbox() {
		addBtn.click();
	}
	
	public void disableTextbox() {
		disableBtn.click();
	}
	
	public String getActionMessage() {
		return actionTxt.getText();
	}

}
