package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadingPage {

	public DynamicLoadingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='/dynamic_loading']")
	private WebElement dynamicLoadingBtn;
	
	@FindBy(xpath="//a[@href='/dynamic_loading/1']")
	private WebElement example1;
	
	@FindBy(xpath="//a[@href='/dynamic_loading/2']")
	private WebElement example2;
	
	@FindBy(xpath="//button[contains(text(),'Start')]")
	private WebElement startBtn;
	
	@FindBy(xpath="//h4[contains(text(),'Hello World!')]")
	private WebElement helloWorld;
	
	public void gotoDynamicLoading() {
		dynamicLoadingBtn.click();
	}
	
	public void gotoExample1() {
		example1.click();
	}
	
	public String getExampleText() throws InterruptedException {
		Thread.sleep(5000);
		return helloWorld.getText();
	}
	
	public void gotoExample2() {
		example2.click();
	}
	
	public void insideExample() {
		startBtn.click();
	}
	
}
