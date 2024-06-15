package prashantbhakuni.Test;

import org.testng.annotations.Test;

import prashantbhakuni.PageObjects.InfiniteScrollPage;
import prashantbhakuni.TestComponents.BaseTest;

public class InfiniteScrollTest extends BaseTest{
	
	@Test
	public void infiniteScroll() throws InterruptedException {
		InfiniteScrollPage infinitescrollpage = new InfiniteScrollPage(driver);
		infinitescrollpage.gotoInfiniteScroll();
	}

}
