package prashantbhakuni.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import prashantbhakuni.PageObjects.EntryAdPage;
import prashantbhakuni.TestComponents.BaseTest;

public class EntryAdTest extends BaseTest{
	
	@Test
	public void entryAd() throws InterruptedException {
		EntryAdPage entryadpage = new EntryAdPage(driver);
		entryadpage.gotoEntryAdPage();
		Assert.assertEquals(entryadpage.getMainText(), "Entry Ad");
	}

}
