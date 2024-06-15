package prashantbhakuni.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GeolocationPage {

	public GeolocationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='/geolocation']")
	private WebElement geolocationBtn;
	
	@FindBy(xpath="//button[contains(text(),'Where am I?')]")
	private WebElement findLocationBtn;
	
	@FindBy(id="lat-value")
	private WebElement lattitude;
	
	@FindBy(id="long-value")
	private WebElement longitude;
	
	public void gotoGeolocationPage() {
		geolocationBtn.click();
		findLocationBtn.click();
		System.out.println("Lattitude: "+lattitude.getText());
		System.out.println("Longitude: "+longitude.getText());
	}
}
