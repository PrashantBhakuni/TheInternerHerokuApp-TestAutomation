package prashantbhakuni.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import prashantbhakuni.PageObjects.FormAuthenticationPage;
import prashantbhakuni.TestComponents.BaseTest;

public class FormAuthenticationTest extends BaseTest{
	
	@Test
	public void formAuthentication() {
		FormAuthenticationPage formauthenticationpage = new FormAuthenticationPage(driver);
		String userName = "tomsmith"; 
		String password = "SuperSecretPassword";
		formauthenticationpage.gotoFormAuthentication();
		Assert.assertEquals(formauthenticationpage.getDetails(userName, password), "Your password is invalid!\n"
				+ "×");
	}
	

}
