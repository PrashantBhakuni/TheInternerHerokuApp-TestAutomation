package prashantbhakuni.Test;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;
import prashantbhakuni.PageObjects.ExitIntentPage;
import prashantbhakuni.TestComponents.BaseTest;

public class ExitIntentTest extends BaseTest{
	
	//note: keep the mouse pointer in the middle of the screen for this test

	@Test
	public void exitIntentTest() throws InterruptedException, AWTException {
		ExitIntentPage exitintentpage = new ExitIntentPage(driver);
		exitintentpage.gotoexitIntentPage();
		Assert.assertEquals(exitintentpage.getModalWindowText(), "THIS IS A MODAL WINDOW");
		exitintentpage.closeModalWindow();
		Assert.assertEquals(exitintentpage.getPageText(), "Exit Intent");
	}
}
