package prashantbhakuni.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import prashantbhakuni.PageObjects.HoversPage;
import prashantbhakuni.TestComponents.BaseTest;

public class HoversTest extends BaseTest{
	
	@Test
	public void hoverTest() {
		HoversPage hoverspage = new HoversPage(driver);
		Assert.assertEquals(hoverspage.gotoHoversPage(), "name: user2");
		
	}

}
