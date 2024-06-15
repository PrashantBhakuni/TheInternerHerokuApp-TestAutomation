package prashantbhakuni.Test;

import org.testng.annotations.Test;

import prashantbhakuni.PageObjects.InputsPage;
import prashantbhakuni.TestComponents.BaseTest;

public class InputsTest extends BaseTest {
	
	@Test
	public void inputs() {
		InputsPage inputspage = new InputsPage(driver);
		inputspage.gotoInputsPage();
	}

}
