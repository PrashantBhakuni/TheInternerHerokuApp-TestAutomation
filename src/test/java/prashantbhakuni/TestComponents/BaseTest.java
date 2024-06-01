package prashantbhakuni.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import prashantbhakuni.PageObjects.AddRemovePage;

public class BaseTest {

	public WebDriver driver;
    public AddRemovePage addRemovepage;
	public void initializeDriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\main\\java\\prashantbhakuni\\resources\\GlobalData.properties");
		prop.load(fis);
		
		String browserName = System.getProperty("browser")!=null?System.getProperty("browser"):prop.getProperty("browser");
		if (browserName.contains("chrome")) {
			driver = new ChromeDriver();

		} else if (browserName.contains("edge")) {
			driver = new EdgeDriver();
		}

		else if (browserName.contains("firefox")) {
			driver = new FirefoxDriver();
		}
	}

	@BeforeMethod
	public void launchWebsite() throws IOException {
		initializeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		addRemovepage = new AddRemovePage(driver);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
