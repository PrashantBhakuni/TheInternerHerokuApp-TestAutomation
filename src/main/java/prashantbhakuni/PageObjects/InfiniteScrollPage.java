package prashantbhakuni.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InfiniteScrollPage {

	WebDriver driver;
	public InfiniteScrollPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='/infinite_scroll']")
	private WebElement infiniteScrollBtn;
	
	@FindBy(xpath="infiniteScrollBtn")
	private WebElement pageTitle;
	
	public void gotoInfiniteScroll() throws InterruptedException {
		infiniteScrollBtn.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(1000);
		js.executeScript("window.scroll(0,5000)");
	}
}
