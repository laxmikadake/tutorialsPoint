package tutorialsPointPom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArtificialIntelligencewithPythonPage {
	public ArtificialIntelligencewithPythonPage( WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class=\"mui-btn mui-btn--primary categories\"]") private WebElement categories;
	public WebElement getCategories() {
		return categories;
	}
	public void setCategories(WebElement categories) {
		this.categories = categories;
	}
	public void clickOncategories()
	{
		categories.click();
	}
	@FindBy(xpath="//ul[@class=\"mui-dropdown__menu cat-menu mui--is-open\"]/li/ul/li") private List<WebElement> categoriesDropDownList;
	public List<WebElement> getCategoriesDropDownList() {
		return categoriesDropDownList;
	}
	public void setCategoriesDropDownList(List<WebElement> categoriesDropDownList) {
		this.categoriesDropDownList = categoriesDropDownList;
	}
	@FindBy(xpath=" //a[@href=\"/big_data_tutorials.htm\"]") private WebElement  BigDataAndAnalytics ;
	public WebElement getBigDataAndAnalytics() {
		return BigDataAndAnalytics;
	}
	public void setBigDataAndAnalytics(WebElement bigDataAndAnalytics) {
		BigDataAndAnalytics = bigDataAndAnalytics;
	}
	
	
	
	

}
