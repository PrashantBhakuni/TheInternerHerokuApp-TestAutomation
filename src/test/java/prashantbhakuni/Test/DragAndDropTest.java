package prashantbhakuni.Test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import prashantbhakuni.PageObjects.DragAndDropPage;
import prashantbhakuni.TestComponents.BaseTest;

public class DragAndDropTest extends BaseTest{
	
	@Test
	public void dragAndDrop() {
		DragAndDropPage draganddroppage = new DragAndDropPage(driver);
		draganddroppage.gotoDragAndDropPage();
		Actions a = new Actions(driver);
		a.dragAndDrop(draganddroppage.getElementA(), draganddroppage.getElementB()).build().perform();
	}

}
