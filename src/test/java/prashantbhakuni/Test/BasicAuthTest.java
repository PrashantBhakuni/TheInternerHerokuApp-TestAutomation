package prashantbhakuni.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import prashantbhakuni.PageObjects.BasicAuthPage;
import prashantbhakuni.TestComponents.BaseTest;

public class BasicAuthTest extends BaseTest{
	
	
	@Test
	public void basicAuth() {
		
		BasicAuthPage basicauthpage = new BasicAuthPage(driver);
		basicauthpage.gotoBasicAuthPage();
		Assert.assertEquals(basicauthpage.getMessage(), "Congratulations! You must have the proper credentials.");
	}

}
