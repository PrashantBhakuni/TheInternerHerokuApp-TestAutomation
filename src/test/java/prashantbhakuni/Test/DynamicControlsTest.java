package prashantbhakuni.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import prashantbhakuni.PageObjects.DynamicControlsPage;
import prashantbhakuni.TestComponents.BaseTest;

public class DynamicControlsTest extends BaseTest{

	@Test
	public void dynamicControls() throws InterruptedException {
		DynamicControlsPage dynamiccontrolspage = new DynamicControlsPage(driver);
		dynamiccontrolspage.gotoDynamicControls();
		dynamiccontrolspage.checkboxSection();
		Assert.assertEquals(dynamiccontrolspage.getActionMessage(), "It's gone!");
		dynamiccontrolspage.textboxSection();
		Assert.assertEquals(dynamiccontrolspage.getActionMessage(), "It's enabled!");
		dynamiccontrolspage.addCheckbox();
		Assert.assertEquals(dynamiccontrolspage.getActionMessage(), "It's back!");
		dynamiccontrolspage.disableTextbox();
		Assert.assertEquals(dynamiccontrolspage.getActionMessage(), "It's disabled!");
	}
}
