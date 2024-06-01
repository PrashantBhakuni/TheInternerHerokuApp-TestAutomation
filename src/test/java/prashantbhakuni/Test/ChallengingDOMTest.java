package prashantbhakuni.Test;

import org.testng.annotations.Test;

import prashantbhakuni.PageObjects.ChallengingDOMPage;
import prashantbhakuni.TestComponents.BaseTest;

public class ChallengingDOMTest extends BaseTest {

	@Test
	public void challengingDom() {

		// this test demonstrates that the same button gets a random text after every click

		ChallengingDOMPage challengingcompage = new ChallengingDOMPage(driver);
		challengingcompage.gotoChallengingDOM();
		challengingcompage.clickButton2();
		System.out.println(challengingcompage.getButton2Text());
		challengingcompage.clickButton2();
		System.out.println(challengingcompage.getButton2Text());
		challengingcompage.clickButton2();
		System.out.println(challengingcompage.getButton2Text());
	}

}
