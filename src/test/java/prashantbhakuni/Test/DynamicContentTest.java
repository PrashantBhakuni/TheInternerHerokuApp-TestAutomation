package prashantbhakuni.Test;

import org.testng.annotations.Test;

import prashantbhakuni.PageObjects.DynamicContentPage;
import prashantbhakuni.TestComponents.BaseTest;

public class DynamicContentTest extends BaseTest{
	
	@Test
	public void dynamicContent() {
		
		DynamicContentPage dynamiccontentpage = new DynamicContentPage(driver);
		dynamiccontentpage.gotoDynamicCountPage();
	}

}
