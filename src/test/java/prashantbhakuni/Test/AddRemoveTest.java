package prashantbhakuni.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import prashantbhakuni.TestComponents.BaseTest;

public class AddRemoveTest extends BaseTest{
	
	
	@Test
	public void addRemove()
	{
		addRemovepage.gotoAddRemovePage();
		addRemovepage.performAddAction();
		Assert.assertEquals(addRemovepage.geDeleteText(), "Delete");
		addRemovepage.performDeleteAction();

	}

}
