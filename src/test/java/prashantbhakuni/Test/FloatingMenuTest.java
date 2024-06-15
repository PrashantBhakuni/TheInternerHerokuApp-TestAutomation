package prashantbhakuni.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import prashantbhakuni.PageObjects.FloatingMenuPage;
import prashantbhakuni.TestComponents.BaseTest;

public class FloatingMenuTest extends BaseTest{
	
	@Test
	public void floatingMenu() {
		FloatingMenuPage floatingmenupage = new FloatingMenuPage(driver);
		floatingmenupage.gotoFloatingMenu();
		Assert.assertEquals(floatingmenupage.setHome(), "https://the-internet.herokuapp.com/floating_menu#home");
		Assert.assertEquals(floatingmenupage.setNews(), "https://the-internet.herokuapp.com/floating_menu#news");
		Assert.assertEquals(floatingmenupage.setContact(), "https://the-internet.herokuapp.com/floating_menu#contact");
		Assert.assertEquals(floatingmenupage.setAbout(), "https://the-internet.herokuapp.com/floating_menu#about");
	}

}
