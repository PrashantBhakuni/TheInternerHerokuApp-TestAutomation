package prashantbhakuni.Test;

import org.testng.annotations.Test;

import prashantbhakuni.PageObjects.GeolocationPage;
import prashantbhakuni.TestComponents.BaseTest;

public class GeolocationTest extends BaseTest{
	
	@Test
	public void geolocation() {
		GeolocationPage geolocation = new GeolocationPage(driver);
		geolocation.gotoGeolocationPage();
	}

}
