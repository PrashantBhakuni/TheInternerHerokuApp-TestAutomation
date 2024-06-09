package prashantbhakuni.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import prashantbhakuni.PageObjects.DisappearingElementsPage;
import prashantbhakuni.TestComponents.BaseTest;

public class DisappearingElementsTest extends BaseTest {
	
	@Test
	public void disappearingElementsTest() {
		DisappearingElementsPage disappearingelementspage = new DisappearingElementsPage(driver);
		disappearingelementspage.gotoDissappearingElement();
		int originalCount = disappearingelementspage.countElements();
//		System.out.println("count before refresh = "+originalCount);
		driver.navigate().refresh();

		while(originalCount==disappearingelementspage.countElements())
		{
			driver.navigate().refresh();
		}
		Assert.assertNotEquals(disappearingelementspage.countElements(), originalCount);
//		System.out.println("count after refresh = "+disappearingelementspage.countElements());

	}

}
