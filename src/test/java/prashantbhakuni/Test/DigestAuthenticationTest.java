package prashantbhakuni.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import prashantbhakuni.PageObjects.DigestAuthenticationPage;
import prashantbhakuni.TestComponents.BaseTest;

public class DigestAuthenticationTest extends BaseTest {
	
	@Test
	public void basicAuth() {
		
		DigestAuthenticationPage digestauthpage = new DigestAuthenticationPage(driver);
		digestauthpage.gotoDigestAuthPage();
		Assert.assertEquals(digestauthpage.getMessage(), "Congratulations! You must have the proper credentials.");
	}

}
