package prashantbhakuni.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import prashantbhakuni.PageObjects.BrokenImagesPage;
import prashantbhakuni.TestComponents.BaseTest;

public class BrokenImagesTest extends BaseTest{
	
	@Test
	public void brokenImages() {
		BrokenImagesPage brokenimagepage = new BrokenImagesPage(driver);
		brokenimagepage.gotoBrokenImagePage();
		Assert.assertEquals(brokenimagepage.countBrokenImages(), 2);
	}
	

}
