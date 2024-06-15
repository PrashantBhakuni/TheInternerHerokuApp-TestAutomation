package prashantbhakuni.Test;

import org.testng.annotations.Test;

import prashantbhakuni.PageObjects.HorizontalSliderPage;
import prashantbhakuni.TestComponents.BaseTest;

public class HorizontalSliderTest extends BaseTest{
	
	@Test
	public void horinzontalSlider() {
		HorizontalSliderPage horizontalsliderpage = new HorizontalSliderPage(driver);
		horizontalsliderpage.gotoHorizontalSlider();
	}

}
