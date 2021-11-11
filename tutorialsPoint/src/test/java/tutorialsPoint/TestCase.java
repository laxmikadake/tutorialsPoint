package tutorialsPoint;

import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import tutorialsPointPom.ArtificialIntelligencewithPythonPage;
import tutorialsPointPom.HomePage;
import tutorialsPointPom.LibraryPage;

public class TestCase {
@Test
	public void runTestCase() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.tutorialspoint.com/index.htm");
		HomePage homepage=new HomePage(driver);
		homepage.clickOnLibrary();
		LibraryPage librarypage=new LibraryPage(driver);
		librarypage.ClickOnArtificialIntelligencewithPython();
	    ArtificialIntelligencewithPythonPage artificalPage=new ArtificialIntelligencewithPythonPage(driver);
		artificalPage.clickOncategories();
		List<WebElement> options = artificalPage.getCategoriesDropDownList();
		int expectedNumberOfOptions=33;
		int actualNumberOfOptions=options.size();
		Assert.assertEquals(actualNumberOfOptions, expectedNumberOfOptions);
		Assert.assertTrue(artificalPage.getBigDataAndAnalytics().isDisplayed());
		driver.quit();
		
		
		
		
		
		
		

	}

}
