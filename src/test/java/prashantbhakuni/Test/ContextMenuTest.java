package prashantbhakuni.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import prashantbhakuni.PageObjects.ContextMenuPage;
import prashantbhakuni.TestComponents.BaseTest;

public class ContextMenuTest extends BaseTest{
	
	@Test
	public void contextMenu() {
		ContextMenuPage contexmenupage =new ContextMenuPage(driver);
		contexmenupage.gotoContextMenuPage();
		contexmenupage.boxClick();
		Assert.assertEquals(contexmenupage.getMenuText(), "You selected a context menu");
		driver.switchTo().alert().accept();
	}

}
