package prashantbhakuni.Test;

import org.testng.annotations.Test;

import prashantbhakuni.PageObjects.FileDownloadPage;
import prashantbhakuni.TestComponents.BaseTest;

public class FileDownloadTest extends BaseTest{
	
	@Test
	public void fileDownload() throws InterruptedException {
		FileDownloadPage filedownloadpage = new FileDownloadPage(driver);
		filedownloadpage.gotofileDownloadPage();
		filedownloadpage.downloadImage();
	}

}
