package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this); 
	}
	@FindBy(xpath="//div[text()=\"Sauce Labs Backpack\"]") 
	private WebElement sauceLabItem;
	
	public WebElement getSauceLabItem()
	{
		return sauceLabItem; 
	}
	public void clickItem()
	{
		sauceLabItem.click();
	}
	
	
}
