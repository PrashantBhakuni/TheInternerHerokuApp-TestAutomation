package prashantbhakuni.Test;

import org.testng.annotations.Test;

import prashantbhakuni.PageObjects.FileUploadPage;
import prashantbhakuni.TestComponents.BaseTest;

public class FileUploadTest extends BaseTest{
	
	@Test
	public void fileUpload() {
		FileUploadPage fileuploadpage = new FileUploadPage(driver);
		fileuploadpage.gotoFileUploadPage();
		fileuploadpage.uploadFile();
	}
}
