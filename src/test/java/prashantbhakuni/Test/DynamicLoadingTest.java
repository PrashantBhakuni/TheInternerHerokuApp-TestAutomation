package prashantbhakuni.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import prashantbhakuni.PageObjects.DynamicLoadingPage;
import prashantbhakuni.TestComponents.BaseTest;

public class DynamicLoadingTest extends BaseTest{
	DynamicLoadingPage dynamicloadingpage;
	
	@Test
	public void loadingForExample1() throws InterruptedException {
		dynamicloadingpage = new DynamicLoadingPage(driver);
		dynamicloadingpage.gotoDynamicLoading();
		dynamicloadingpage.gotoExample1();
		Assert.assertNotEquals(dynamicloadingpage.getExampleText(), "Hello World!"); //element is present, but hidden so it won't be equal
		dynamicloadingpage.insideExample();
		Assert.assertEquals(dynamicloadingpage.getExampleText(), "Hello World!");
		
		
	}
	
	@Test
	public void loadingForExample2() throws InterruptedException {
		dynamicloadingpage = new DynamicLoadingPage(driver);
		dynamicloadingpage.gotoDynamicLoading();
		dynamicloadingpage.gotoExample2();
		try {
		Assert.assertEquals(dynamicloadingpage.getExampleText(), "Hello World!"); // there is no such element present
		}catch(Exception e) {System.out.println("It is not a hidden element"); //
		}
		finally {
		dynamicloadingpage.insideExample();
		Assert.assertEquals(dynamicloadingpage.getExampleText(), "Hello World!");
		}
	}
	

}
