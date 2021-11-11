package tutorialsPointPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//span[text()='Library']")	private WebElement library;
	public WebElement getLibrary() {
		return library;
	}
	public void setLibrary(WebElement library) {
		this.library = library;
	}
	public void clickOnLibrary()
	{
		library.click();
	}
	

}
