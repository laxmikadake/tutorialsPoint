package tutorialsPointPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryPage {
	
	public LibraryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@href=\"/artificial_intelligence_with_python/index.htm\"])[2]") private WebElement ArtificialIntelligencewithPython;
	public WebElement getArtificialIntelligencewithPython() {
		return ArtificialIntelligencewithPython;
	}
	public void setArtificialIntelligencewithPython(WebElement artificialIntelligencewithPython) {
		ArtificialIntelligencewithPython = artificialIntelligencewithPython;
	}
	public void  ClickOnArtificialIntelligencewithPython()
	{
		ArtificialIntelligencewithPython.click();
	}
	
}
