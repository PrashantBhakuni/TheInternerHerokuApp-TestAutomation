package prashantbhakuni.Test;

import org.testng.annotations.Test;

import prashantbhakuni.PageObjects.DropdownPage;
import prashantbhakuni.TestComponents.BaseTest;

public class DropdownTest extends BaseTest{
	
	@Test
	public void dropdownTest()
	{
		DropdownPage dropdownpage = new DropdownPage(driver);
		dropdownpage.gotoDropDownPage();
		dropdownpage.getDropdownOptions();
	}

}
