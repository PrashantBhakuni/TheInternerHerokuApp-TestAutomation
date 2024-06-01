package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemovePage {
	WebDriver driver;

	public AddRemovePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/add_remove_elements/']")
	private WebElement addRemoveBtn;

	@FindBy(css = "button[onclick='addElement()']")
	private WebElement addBtn;

	@FindBy(css = ".added-manually")
	private WebElement deleteBtn;

	public void gotoAddRemovePage() {
		addRemoveBtn.click();
	}

	public void performAddAction() {
		addBtn.click();
	}

	public String geDeleteText() {
		return deleteBtn.getText();
	}

	public void performDeleteAction() {
		deleteBtn.click();
	}
}
