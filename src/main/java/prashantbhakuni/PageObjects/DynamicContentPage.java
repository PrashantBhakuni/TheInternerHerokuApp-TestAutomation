package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicContentPage {

	public DynamicContentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/dynamic_content']")
	private WebElement dynamicCountPageBtn;
	
	@FindBy(xpath="//div[@class='row'][1]/div[@class='large-10 columns']")
	private WebElement txt1;
	
	@FindBy(xpath="//div[@class='row'][2]/div[@class='large-10 columns']")
	private WebElement txt2;
	
	@FindBy(xpath="//div[@class='row'][3]/div[@class='large-10 columns']")
	private WebElement txt3;
	
	@FindBy(xpath="///div[1]/div/img")
	private WebElement img1;
	
	@FindBy(xpath="//div[2]/div/img']")
	private WebElement img2;
	
	@FindBy(xpath="//img[@src='/img/avatars/Original-Facebook-Geek-Profile-Avatar-5.jpg']")
	private WebElement img3;
	

	public void gotoDynamicCountPage() {

		dynamicCountPageBtn.click();
	}

}
