package prashantbhakuni.PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExitIntentPage {

	WebDriver driver;

	public ExitIntentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/exit_intent']")
	private WebElement exintIntentPageBtn;

	@FindBy(xpath = "//h3[contains(text(),'This is a modal window')]")
	private WebElement modalWindowHeader;

	@FindBy(xpath = "//p[contains(text(),'Close')]")
	private WebElement closeDialogueBox;

	@FindBy(xpath = "//h3[contains(text(),'Exit Intent')]")
	WebElement pageText;

	public void gotoexitIntentPage() throws AWTException {
		exintIntentPageBtn.click();
		Robot robot = new Robot();
		robot.mouseMove(600, 0);
	}

	public String getModalWindowText() {
		return modalWindowHeader.getText();
	}

	public void closeModalWindow() {
		closeDialogueBox.click();
	}

	public String getPageText() {
		return pageText.getText();
	}
}
