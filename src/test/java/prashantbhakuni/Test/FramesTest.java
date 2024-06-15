package prashantbhakuni.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import prashantbhakuni.PageObjects.FramesPage;
import prashantbhakuni.TestComponents.BaseTest;

public class FramesTest extends BaseTest{
	
	FramesPage framespage;
	
	@Test
	public void nestedFrames() {
		framespage = new FramesPage(driver);
		framespage.gotoFramesPage();
		Assert.assertEquals(framespage.gotoNestedFrames(), "MIDDLE");	
	}
	
	@Test
	public void iFrame() {
		framespage = new FramesPage(driver);
		framespage.gotoFramesPage();
		Assert.assertEquals(framespage.gotoIframe(), "Your content goes here.");
	}

}
