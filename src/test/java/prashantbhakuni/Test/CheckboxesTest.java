package prashantbhakuni.Test;

import org.testng.annotations.Test;

import prashantbhakuni.PageObjects.CheckboxesPage;
import prashantbhakuni.TestComponents.BaseTest;

public class CheckboxesTest extends BaseTest{
	
	@Test
	public void checkboxes()
	{
		CheckboxesPage checkboxespage = new CheckboxesPage(driver);
		checkboxespage.gotoCheckboxesPage();
		checkboxespage.performAction();
	}

}
